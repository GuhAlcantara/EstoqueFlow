package entities;

import java.util.Date;

public class Prato {
	private String nome;
	private int quantidade;
	private Date validade;

	{

	}

	public Prato() {
	}

	public Prato(String nome, int quantidade, Date validade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.validade = validade;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
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
