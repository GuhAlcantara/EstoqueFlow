package entities;

import java.util.Date;

public class Bebida extends Produto {


	private double miliLitros;


	{

	}

	public Bebida(String nome, String marca,String lote, double miliLitros, Date dataValidade) {
		super(nome, lote, marca, miliLitros, dataValidade);
		this.miliLitros = miliLitros;

	}

	@Override
	public String toString() {
		return "Produto Cadastrado: \n"
				+"Nome: " + nome
				+"Marca:" + marca
				+"Lote: " + lote
				+"Quantidade: " + miliLitros
				+"Data de Validade: " + dataValidade;
	}
}
