package br.com.amcell.amcellsystem.models;

import java.util.Objects;

public class ItemDaVenda {

    private Produto produto;
    private Integer quantidade;

    public ItemDaVenda(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
        ItemDaVenda that = (ItemDaVenda) o;
        return Objects.equals(produto, that.produto) && Objects.equals(quantidade, that.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto, quantidade);
    }

    @Override
    public String toString() {
        return "ItemDaVenda{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
