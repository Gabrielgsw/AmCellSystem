package br.com.amcell.amcellsystem.db;
import br.com.amcell.amcellsystem.exceptions.ElementoJaExistenteException;
import br.com.amcell.amcellsystem.exceptions.ElementoNaoExistenteException;

import java.util.List;

public interface IRepository<T> {

    void adicionar(T t) throws ElementoJaExistenteException;

    List<T> listarTudo();

    void remover (T t)throws ElementoNaoExistenteException;

    void atualizar(T antigo, T novo) throws ElementoNaoExistenteException;

}
