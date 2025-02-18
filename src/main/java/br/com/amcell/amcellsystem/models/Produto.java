package br.com.amcell.amcellsystem.models;

import java.util.Objects;

public abstract class Produto {

    private String nome;
    private Double precoVenda;
    private String descricao;


    public Produto(String nome, Double precoVenda, String descricao) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(precoVenda, produto.precoVenda) && Objects.equals(descricao, produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, precoVenda, descricao);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoVenda=" + precoVenda +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
