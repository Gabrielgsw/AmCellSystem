package br.com.amcell.amcellsystem.db;

import br.com.amcell.amcellsystem.exceptions.ElementoJaExistenteException;
import br.com.amcell.amcellsystem.exceptions.ElementoNaoExistenteException;
import br.com.amcell.amcellsystem.models.Produto;

import java.util.List;
import java.util.ArrayList;


public class ProdutosRepository implements IRepository<Produto>{

    private List<Produto> produtos;

    public ProdutosRepository() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionar(Produto produto) throws ElementoJaExistenteException {
        Boolean jaExistente = produtos.contains(produto);
        if(jaExistente){
            throw new ElementoJaExistenteException();
        }else{
            this.produtos.add(produto);
        }

    }

    @Override
    public List<Produto> listarTudo() {
        if(!produtos.isEmpty()){
            return produtos;
        }
        return null;
    }

    //public List<Produto>

    @Override
    public void remover(Produto produto) throws ElementoNaoExistenteException {

        for(Produto p : produtos){
            if(p.getProdutctId().equals(produto.getProdutctId())){
                produtos.remove(p);
                break;
            }else{
                throw new ElementoNaoExistenteException();
            }
        }

    }

    @Override
    public void atualizar(Produto antigo, Produto novo) throws ElementoNaoExistenteException{
        int index = 0;
        for(Produto p : produtos){
            if(p.getProdutctId().equals(antigo.getProdutctId())){
                index = produtos.indexOf(p);
            }
        }
        if(produtos.contains(antigo)){
            produtos.set(index,novo);
        }else{
            throw new ElementoNaoExistenteException();
        }

    }
}
