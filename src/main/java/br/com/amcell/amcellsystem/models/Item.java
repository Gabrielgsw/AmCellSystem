package br.com.amcell.amcellsystem.models;

import java.time.LocalDate;
import java.util.Objects;

public class Item extends Produto {

    private String marca;
    private Double precoCompra;
    private LocalDate dataCompra;

    public Item(String nome, Double precoVenda, String descricao) {
        super(nome, precoVenda, descricao);
    }

    public Item(String nome, Double precoVenda, String descricao, String marca, LocalDate dataCompra, Double precoCompra) {
        super(nome, precoVenda, descricao);
        this.marca = marca;
        this.dataCompra = dataCompra;
        this.precoCompra = precoCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Item item = (Item) o;
        return Objects.equals(marca, item.marca) && Objects.equals(precoCompra, item.precoCompra) && Objects.equals(dataCompra, item.dataCompra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marca, precoCompra, dataCompra);
    }

    @Override
    public String toString() {
        return "Item{" +
                "marca='" + marca + '\'' +
                ", precoCompra=" + precoCompra +
                ", dataCompra=" + dataCompra +
                '}';
    }
}
