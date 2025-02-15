package model;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Getter
@Setter
public class Estoque {
    public String nome;
    public ArrayList<Item> itens;
    public int quantidade;

    public Estoque(String nome, ArrayList<Item> itens, Integer quantidade) {
        this.nome = nome;
        this.itens = itens;
        this.quantidade = quantidade;
    }
}
