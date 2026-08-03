package entities;

import java.util.Date;

public class Produto {
    protected String nome, lote, marca;
    protected double quantidade, pesoProduto;
    protected Date dataValidade;


    public Produto(String nome,Date dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

            // CONTRUTOR PARA PRODUTOS EM ***QUATIDADE****
    public Produto(String nome, String lote, String marca, double quantidade, Date data) {
        this.nome = nome;
        this.lote = lote;
        this.marca = marca;
        this.quantidade = quantidade;
        this.dataValidade = data;
    }

            // CONSTRUTOR PARA PRODUTOS EM  ***PESO***
    public Produto(String nome, String lote, String marca, double quantidade, double pesoProduto, Date data) {
        this.nome = nome;
        this.lote = lote;
        this.marca = marca;
        this.pesoProduto = pesoProduto;
        this.dataValidade = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        if (marca != null) {
            this.lote = lote;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }

    }

    public double getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(double pesoProduto) {
        if (pesoProduto != 0) {
            this.pesoProduto = pesoProduto;
        }
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setValidade(Date dataValidade) {
        if (dataValidade != null) {
            this.dataValidade = dataValidade;
        }
    }

    @Override
    public String toString() {
        return "Produto : \n"
                +"Nome: " + nome + "\n"
                +"Data de Validade: " + dataValidade;
    }
}