package entities;

import java.util.Date;

public class Bebida {
	
	private static int bebidasID;
	private String nome, marca;
	private double litros;
	private Date validade;
	private int quantidade;

	{

	}

	public Bebida() {

	}

	public Bebida(String nome, String marca, double litros, Date validade, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.litros = litros;
		this.validade = validade;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {this.nome = nome;}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca != null) {this.marca = marca;}
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		if (litros >= 0) {
			this.litros = litros;
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		}

	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		if (validade != null) {
			this.validade = validade;
		}
	}

}
