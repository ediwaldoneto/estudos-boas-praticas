package br.com.nt.builder;

/**
 * @author Neto
 * @since 05/04/2020
 */
public class Produto {

	private String nome;
	private Double valor;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}

}
