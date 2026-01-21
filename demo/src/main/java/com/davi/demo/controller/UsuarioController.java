package com.davi.demo.controller;

import com.davi.demo.business.UsuarioService;
import com.davi.demo.infrastucture.entitys.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paginadousuario")

public class UsuarioController {

    private final UsuarioService usuarioService ;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }




    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {

        usuarioService.salvarUsuario(usuario);

        return ResponseEntity.ok().build();
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestBody Long id){
        usuarioService.deletarUsuario(id);

        return ResponseEntity.ok().build();
    }
     @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorId (@RequestBody Long id){
         return ResponseEntity.ok(usuarioService.buscarUsuarioPorID(id));
     }






}
