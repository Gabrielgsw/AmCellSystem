package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ItemDaVenda {
    public Produto produto;
    public int quantidade;

    public ItemDaVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
