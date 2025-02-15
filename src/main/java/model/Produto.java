package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    public String nome;
    public String descricao;
    public double precoDeVenda;

    public Produto(String nome, String descricao, double precoDeVenda) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoDeVenda = precoDeVenda;
    }
}
