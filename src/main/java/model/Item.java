package model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    public String marca;
    public String precoDaCompra;
    public LocalDate dataCompra;

    public Item(String marca, String precoDaCompra, LocalDate dataCompra) {
        this.marca = marca;
        this.precoDaCompra = precoDaCompra;
        this.dataCompra = dataCompra;
    }


}
