package com.davi.demo.business;

import com.davi.demo.infrastucture.entitys.Usuario;
import com.davi.demo.infrastucture.repository.RepositoryUsuario;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;




@Service
public class UsuarioService {

    private final RepositoryUsuario repositoryUsuario;

    public UsuarioService(RepositoryUsuario repositoryUsuario) {
        this.repositoryUsuario = repositoryUsuario;
    }

    public void UsuarioService(Usuario usuario) {
        repositoryUsuario.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorID(Long id) {
        return repositoryUsuario.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Usuário não encontrado"));
    }

    public void deletarUsuario(Long ID) {
        repositoryUsuario.deleteById(ID);
    }
}



