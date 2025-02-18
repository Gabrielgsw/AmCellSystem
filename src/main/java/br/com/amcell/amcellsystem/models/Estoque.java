package br.com.amcell.amcellsystem.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Estoque {

    private String nome;
    private List<Item> itens;
    private Integer quantidade;

    public Estoque(String nome,  Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque = (Estoque) o;
        return Objects.equals(nome, estoque.nome) && Objects.equals(itens, estoque.itens) && Objects.equals(quantidade, estoque.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, itens, quantidade);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "nome='" + nome + '\'' +
                ", itens=" + itens +
                ", quantidade=" + quantidade +
                '}';
    }
}
