package br.com.nt.decorator;

import br.com.nt.builder.Venda;

public class MDR extends Desconto {

	public MDR(Desconto desconto) {
		super(desconto);
	}

	public MDR() {
		super();
	}

	@Override
	protected double calcula(Venda venda) {
		
		return venda.getDescontos() * 0.6 - calcularOutroDesconto(venda);
	}

}
