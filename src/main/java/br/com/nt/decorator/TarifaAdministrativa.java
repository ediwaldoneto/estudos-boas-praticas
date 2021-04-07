package br.com.nt.decorator;

import br.com.nt.builder.Venda;

public class TarifaAdministrativa extends Desconto {

	public TarifaAdministrativa(Desconto desconto) {
		super(desconto);
	}

	public TarifaAdministrativa() {
		super();
	}

	@Override
	protected double calcula(Venda venda) {
		
		return venda.getDescontos() * 0.1 - calcularOutroDesconto(venda);
	}

}
