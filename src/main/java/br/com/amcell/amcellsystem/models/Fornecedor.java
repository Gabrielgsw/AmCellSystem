package br.com.amcell.amcellsystem.models;

import java.util.Objects;

public class Fornecedor {

    private String nome;
    private String telefone;
    private String cnpj;

    public Fornecedor(String nome, String telefone, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone) && Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, cnpj);
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
