package br.com.nt.builder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Neto
 * @since 06/04/2020
 */
public class Venda {

	private String comprador;
	private String documentoComprador;
	private Instant dataVenda;
	private double valorBruto;
	private double valorLiquido;
	private double descontos;
	private Integer numeroParcelas;
	private List<Produto> produtos = new ArrayList<>();

	public Venda(String comprador, String documentoComprador, Instant dataVenda, double valorBruto, double valorLiquido,
			double descontos, List<Produto> produtos) {
		this.comprador = comprador;
		this.documentoComprador = documentoComprador;
		this.dataVenda = dataVenda;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.descontos = descontos;
		this.produtos = produtos;
	}

	public Venda(String comprador, String documentoComprador, Instant dataVenda, Integer numeroParcelas) {
		this.comprador = comprador;
		this.documentoComprador = documentoComprador;
		this.dataVenda = dataVenda;
		this.numeroParcelas = numeroParcelas;
	}

	public Venda(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public String getDocumentoComprador() {
		return documentoComprador;
	}

	public void setDocumentoComprador(String documentoComprador) {
		this.documentoComprador = documentoComprador;
	}

	public Instant getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Instant dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Venda [comprador=" + comprador + ", documentoComprador=" + documentoComprador + ", dataVenda="
				+ dataVenda + ", valorBruto=" + valorBruto + ", valorLiquido=" + valorLiquido + ", descontos="
				+ descontos + ", numeroParcelas=" + numeroParcelas + ", produtos=" + produtos + "]";
	}

	public double getValorTotal() {
		return this.produtos.stream().map(produto -> produto.getValor()).reduce(0d, Double::sum);
	}
}
