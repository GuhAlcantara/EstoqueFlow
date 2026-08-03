package entities;

import java.util.Date;

public class Ingrediente extends Produto {

	private double ingredienteQuantidade;

	public Ingrediente(String nome, double ingredienteQuantidade, Date dataValidade ) {
		super(nome, dataValidade);
		this.ingredienteQuantidade  = ingredienteQuantidade;
	}

	@Override
	public String toString() {
		return "Produto : \n"
				+"Nome: " + nome + "\n"
				+ "Quantidade: " + ingredienteQuantidade + "\n"
				+"Data de Validade: " + dataValidade;
	}
}