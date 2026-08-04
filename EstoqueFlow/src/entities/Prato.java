package entities;

import java.time.LocalDate;

public class Prato extends Produto {

	private double pratoQuantidade;

	{

	}

	public Prato(String nome,double pratoQuantidade, LocalDate dataValidade) {
		super(nome, dataValidade);
		this.pratoQuantidade = pratoQuantidade;
	}

	@Override
	public String toString() {
		return "Prato : \n"
				+"Nome: " + nome + "\n"
				+ "Quantidade: " + pratoQuantidade + "\n"
				+"Data de Validade: " + dataValidade;
	}
}
