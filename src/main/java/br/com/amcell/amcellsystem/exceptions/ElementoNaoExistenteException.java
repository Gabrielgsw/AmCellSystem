package br.com.amcell.amcellsystem.exceptions;

public class ElementoNaoExistenteException extends Exception{

    public ElementoNaoExistenteException() {
    }

    public ElementoNaoExistenteException(String message) {
        super("O Elemento Não Existe");
    }
}