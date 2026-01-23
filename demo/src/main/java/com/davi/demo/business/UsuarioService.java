package com.davi.demo.business;

import com.davi.demo.infrastucture.entitys.Usuario;
import com.davi.demo.infrastucture.repository.RepositoryUsuario;

import org.springframework.stereotype.Service;

import javax.naming.directory.Attribute;


@Service
public class UsuarioService {

    private final RepositoryUsuario repositoryUsuario;

    public UsuarioService(RepositoryUsuario repositoryUsuario) {
        this.repositoryUsuario = repositoryUsuario;
    }

    public void salvarUsuario(Usuario usuario) {
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

    public void atualizarUsuarioPorId(Long id){
        Usuario usuarioEntity = buscarUsuarioPorID(id);

        Usuario usuarioStualizado = Usuario.builder()
                .ID(usuario.getID() != null ?
                        usuario.getID() : usuarioEntity.getID()  )
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .build();
    }

}



