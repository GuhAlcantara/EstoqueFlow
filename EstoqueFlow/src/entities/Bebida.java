package entities;

import java.time.LocalDate;

public class Bebida extends Produto {


	private double miliLitros;


	{

	}

	public Bebida(String nome, String marca,String lote, double miliLitros, LocalDate dataValidade) {
		super(nome, lote, marca, miliLitros, dataValidade);
		this.miliLitros = miliLitros;

	}

	@Override
	public String toString() {
		return "Bebida : \n"
				+"Nome: " + nome + "\n"
				+"Marca:" + marca + "\n"
				+"Lote: " + lote + "\n"
				+"Quantidade: " + miliLitros + "\n"
				+"Data de Validade: " + dataValidade;
	}
}
