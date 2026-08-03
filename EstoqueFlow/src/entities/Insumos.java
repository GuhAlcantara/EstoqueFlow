package entities;

import java.util.Date;

public class Insumos extends Produto{
	private double insumoQuantidade;

	public Insumos(String nome,double insumoQuantidade, Date dataValidade) {
		super(nome, dataValidade);
		this.insumoQuantidade = insumoQuantidade;
	}

	@Override
	public String toString() {
		return "Produto Cadastrado: \n"
				+"Nome: " + nome
				+ "Quantidade: " + insumoQuantidade
				+"Data de Validade: " + dataValidade;
	}
}
