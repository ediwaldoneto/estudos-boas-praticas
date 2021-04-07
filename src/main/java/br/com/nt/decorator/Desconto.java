package br.com.nt.decorator;

import br.com.nt.builder.Venda;

public abstract class Desconto {

	private final Desconto outroDesconto;

	public Desconto(Desconto outroDesconto) {
		this.outroDesconto = outroDesconto;
	}

	public Desconto() {
		outroDesconto = null;
	}

	protected double calcularOutroDesconto(Venda venda) {
		return (outroDesconto == null ? 0 : outroDesconto.calcula(venda));
	}

	protected abstract double calcula(Venda venda);
}
