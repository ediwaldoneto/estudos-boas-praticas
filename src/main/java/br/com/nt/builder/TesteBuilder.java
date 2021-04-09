package br.com.nt.builder;

import org.apache.log4j.Logger;

public class TesteBuilder {

	private static final Logger LOGGER = Logger.getLogger(TesteBuilder.class);

	public static void main(String[] args) {

		Venda venda = new VendaBuilder().paraComprador("Neto").comDocumento("2345678")
				.comProduto(new Produto("TV LG 42", 3000.0)).comProduto(new Produto("Notebook DELL", 6000.0))
				.naDataAtual().constroi();

		LOGGER.info(venda.toString());

	}
}
