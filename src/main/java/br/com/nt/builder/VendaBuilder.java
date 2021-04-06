package br.com.nt.builder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Neto
 * @since 06/04/2020
 */

public class VendaBuilder {

	private String comprador;
	private String documentoComprador;
	private Instant dataVenda;
	private double valorBruto;
	private double valorLiquido;
	private double descontos;
	private List<Produto> produtos = new ArrayList<>();

	/**
	 * retorna a si mesmo, o próprio builder, para que o cliente continue utilizando
	 */

	public VendaBuilder paraComprador(String comprador) {
		this.comprador = comprador;
		return this;
	}

	public VendaBuilder comDocumento(String documentoComprador) {
		this.documentoComprador = documentoComprador;
		return this;
	}

	public VendaBuilder comProduto(Produto produto) {
		produtos.add(produto);
		valorBruto += produto.getValor();
		descontos = 0.5;
		valorLiquido = valorBruto - descontos;
		return this;
	}

	public VendaBuilder naDataAtual() {
		this.dataVenda = Instant.now();
		return this;
	}
	
	public Venda controi() {
		return new Venda(comprador, documentoComprador, dataVenda, valorBruto, valorLiquido, descontos, produtos);
	}
}
