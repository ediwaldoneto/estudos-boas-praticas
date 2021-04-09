package br.com.nt.decorator;

import org.apache.log4j.Logger;

import br.com.nt.builder.Produto;
import br.com.nt.builder.Venda;
import br.com.nt.builder.VendaBuilder;

public class TesteDecorator {

	private static final Logger LOGGER = Logger.getLogger(TesteDecorator.class);

	public static void main(String[] args) {

		Desconto desconto = new TarifaAdministrativa(new MDR());

		Venda venda = new VendaBuilder().paraComprador("Neto").comDocumento("8765432345")
				.comProduto(new Produto("Geladeira", 6000.0)).naDataAtual().constroi();
		
		LOGGER.info(desconto.calcula(venda));

	}

}
