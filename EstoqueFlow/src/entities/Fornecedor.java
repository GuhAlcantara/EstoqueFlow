package entities;

import java.util.Date;

public class Fornecedor {

	private static int fornecedorID;
	private String nomeRepresentante, empresa, telefone;
	private Date diaDePedido;
	{

	}

	public Fornecedor() {

	}

	public Fornecedor(String nomeRepresentante, String empresa, String telefone, Date diaDePedido) {
		this.nomeRepresentante = nomeRepresentante;
		this.empresa = empresa;
		this.telefone = telefone;
		this.diaDePedido = diaDePedido;
	}

	public String getNomeRepresentante() {
		return nomeRepresentante;
	}

	public void setNomeRepresentante(String nomeRepresentante) {
		if (nomeRepresentante != null) {
			this.nomeRepresentante = nomeRepresentante;
		}
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		if (empresa != null) {
			this.empresa = empresa;
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone != null) {
			this.telefone = telefone;
		}
	}

	public Date getDiaDePedido() {
		return diaDePedido;
	}

	public void setDiaDePedido(Date diaDePedido) {
		if (diaDePedido != null) {
			this.diaDePedido = diaDePedido;
		}
	}

}
