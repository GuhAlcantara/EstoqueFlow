package entities;

import java.util.Date;

public class Insumos {
	private String nome, marca, lote;
	private int quantidade;
	private Date validade;
	private double peso;
	{

	}

	public Insumos() {
	}

	public Insumos(String nome, String marca, String lote, int quantidade, Date validade, double peso) {
		this.nome = nome;
		this.marca = marca;
		this.lote = lote;
		this.quantidade = quantidade;
		this.validade = validade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca != null) {
			this.marca = marca;
		}
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		if (lote != null) {
			this.lote = lote;
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
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
