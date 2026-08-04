package entities;

import java.time.LocalDate;


public class Insumos extends Produto{
	private double insumoQuantidade;

	public Insumos(String nome, double insumoQuantidade, LocalDate dataValidade) {
		super(nome, dataValidade);
		this.insumoQuantidade = insumoQuantidade;
	}

	@Override
	public String toString() {
		return "Insumo: \n"
				+"Nome: " + nome+ "\n"
				+ "Quantidade: " + insumoQuantidade + "\n"
				+"Data de Validade: " + dataValidade;
	}
}
