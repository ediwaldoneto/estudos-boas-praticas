package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.nt.builder.Produto;
import br.com.nt.builder.Venda;
import br.com.nt.builder.VendaBuilder;

public class TesteLambda {

	private static final Logger LOGGER = Logger.getLogger(TesteLambda.class);

	public static void main(String[] args) {

		LOGGER.info("Iniciando teste com Lambdas");

		List<Venda> vendas = populaVendas();

		Comparator<Venda> comparator = (venda1, venda2) -> {
			return Double.compare(venda1.getValorBruto(), venda2.getValorBruto());
		};

		vendas.sort(comparator);
		LOGGER.info(vendas);

		vendas.sort(comparator.reversed());
		LOGGER.info(vendas);
	}

	private static List<Venda> populaVendas() {

		Venda venda1 = new VendaBuilder().paraComprador("Neto").comProduto(new Produto("Playstation 5", 5500.0))
				.comProduto(new Produto("TV 46'", 2000.0)).naDataAtual().constroi();

		Venda venda2 = new VendaBuilder().paraComprador("Lucas").comProduto(new Produto("Moto Z", 1800.0))
				.comProduto(new Produto("TV 40'", 1000.0)).naDataAtual().constroi();

		Venda venda3 = new VendaBuilder().paraComprador("Daniela").comProduto(new Produto("Monitor Dell 22'", 760.20))
				.naDataAtual().constroi();

		return Arrays.asList(venda1, venda2, venda3);
	}
}
