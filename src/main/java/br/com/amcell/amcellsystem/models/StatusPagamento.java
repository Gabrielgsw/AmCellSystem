package br.com.amcell.amcellsystem.models;

public enum StatusPagamento {

    NAOPAGO("Não pago"),METADEPAGA("Pago 50%"),PAGO("Pago");

    private String value;

    StatusPagamento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
