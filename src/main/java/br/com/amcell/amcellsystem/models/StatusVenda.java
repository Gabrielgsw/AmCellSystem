package br.com.amcell.amcellsystem.models;

public enum StatusVenda {

    ABERTO("Em aberto"),ANDAMENTO("Em andamento"),FINALIZADO("Finalizado");
    private String value;

    StatusVenda(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
