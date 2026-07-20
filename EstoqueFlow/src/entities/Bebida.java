package entities;

import java.util.Date;

public class Bebida {

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
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

}
