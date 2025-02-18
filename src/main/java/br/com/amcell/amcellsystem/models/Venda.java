package br.com.amcell.amcellsystem.models;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Venda {

    private Cliente cliente;
    private List<ItemDaVenda> itens;
    private LocalDate data;

    public Venda(Cliente cliente, LocalDate data) {
        this.cliente = cliente;
        this.data = data;
        itens = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(cliente, venda.cliente) && Objects.equals(itens, venda.itens) && Objects.equals(data, venda.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, itens, data);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", data=" + data +
                '}';
    }
}
