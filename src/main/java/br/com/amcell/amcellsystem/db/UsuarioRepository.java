package br.com.amcell.amcellsystem.db;

import br.com.amcell.amcellsystem.exceptions.ElementoJaExistenteException;
import br.com.amcell.amcellsystem.exceptions.ElementoNaoExistenteException;
import br.com.amcell.amcellsystem.models.Item;
import br.com.amcell.amcellsystem.models.Usuario;

import java.util.List;
import java.util.ArrayList;

public class UsuarioRepository implements IRepository<Usuario> {

    private List<Usuario> usuarios;

    public UsuarioRepository(){
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionar(Usuario usuario) throws ElementoJaExistenteException {
        if(!usuarios.contains(usuario)){
            usuarios.add(usuario);
        }else{
            throw new ElementoJaExistenteException();
        }

    }

    @Override
    public List<Usuario> listarTudo() {
        return new ArrayList<>(usuarios);
    }

    @Override
    public void remover(Usuario usuario) throws ElementoNaoExistenteException {
        boolean existe = false;
        for(Usuario u : usuarios){
            if(usuario.getEmail() == u.getEmail()) {
                existe = true;
            }
        }
        if(existe){
            usuarios.remove(usuario);
        }
        else{
            throw new ElementoNaoExistenteException();
        }
    }

    @Override
    public void atualizar(Usuario antigo, Usuario novo) throws ElementoNaoExistenteException {
        int indice=procurarIndice(antigo);

        if(indice>=0){
            this.usuarios.set(indice, novo);
        }else{
            throw new ElementoNaoExistenteException();
        }
    }

    private int procurarIndice(Usuario U) {
        String verificacaoEmail = U.getEmail();
        for (int i = 0; i < this.usuarios.size(); i++) {
            if (verificacaoEmail.equals(this.usuarios.get(i).getEmail())) {
                return i;
            }
        }
        return -1;
    }
}
