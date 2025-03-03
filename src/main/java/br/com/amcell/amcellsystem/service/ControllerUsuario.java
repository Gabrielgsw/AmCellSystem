package br.com.amcell.amcellsystem.service;

import br.com.amcell.amcellsystem.db.IRepository;
import br.com.amcell.amcellsystem.models.Usuario;

public class ControllerUsuario {

    private IRepository<Usuario> repositoryUser;
    private ControllerUsuario user;

    public ControllerUsuario() {
        repositoryUser = new;
    }
}
