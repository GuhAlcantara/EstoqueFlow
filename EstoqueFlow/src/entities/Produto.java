package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
    protected String nome, lote, marca;
    protected double quantidade, pesoProduto;
    protected LocalDate dataValidade;


    public Produto(String nome, LocalDate dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

            // CONTRUTOR PARA PRODUTOS EM ***QUANTIDADE****
    public Produto(String nome, String lote, String marca, double quantidade, LocalDate data) {
        this.nome = nome;
        this.lote = lote;
        this.marca = marca;
        this.quantidade = quantidade;
        this.dataValidade = data;
    }

            // CONSTRUTOR PARA PRODUTOS EM  ***PESO***
    public Produto(String nome, String lote, String marca, double quantidade, double pesoProduto, LocalDate data) {
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

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setValidade(LocalDate dataValidade) {
        if (dataValidade != null) {
            this.dataValidade = dataValidade;
        }
    }

    public String getDataValidadeFormat(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataValidade.format(formatter);
    }

    @Override
    public String toString() {
        return "****Produto****\n"
                +"Nome: " + nome + "\n"
                +"Data de Validade: " + dataValidade;
    }
}