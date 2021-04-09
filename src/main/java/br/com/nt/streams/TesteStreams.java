package br.com.nt.streams;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.nt.builder.Venda;

public class TesteStreams {

	private static final Logger LOGGER = Logger.getLogger(TesteStreams.class);

	public static void main(String[] args) {

		List<Venda> vendas = processaVendas();

		LOGGER.info(":: INICIANDO TESTE STREAMS ::");

		vendas.stream().filter(venda -> venda.getNumeroParcelas() == 1).forEach(LOGGER::info);

	}

	private static List<Venda> processaVendas() {

		Venda venda1 = new Venda("Paulo", "26584992", Instant.now(), 6); 
		Venda venda2 = new Venda("Lucas", "11112532", Instant.now(), 1);
		Venda venda3 = new Venda("Leila", "69854753", Instant.now(), 3);
		Venda venda4 = new Venda("Mariana", "33254789", Instant.now(), 10);

		return Arrays.asList(venda1, venda2, venda3, venda4);
	}
}
