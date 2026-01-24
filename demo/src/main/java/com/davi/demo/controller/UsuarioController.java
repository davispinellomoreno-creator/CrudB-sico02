package com.davi.demo.controller;

import com.davi.demo.business.UsuarioService;
import com.davi.demo.infrastucture.entitys.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

@RestController
@RequestMapping("/paginadousuario")

public class UsuarioController {

    private final UsuarioService usuarioService ;
    private final Usuario usuario;

    public UsuarioController(UsuarioService usuarioService, Usuario usuario) {
        this.usuarioService = usuarioService;

        this.usuario = usuario;
    }




    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {

        usuarioService.salvarUsuario(usuario);

        return ResponseEntity.ok().build();
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestParam Long id){
        usuarioService.deletarUsuario(id);

        return ResponseEntity.ok().build();
    }
     @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorId (@RequestParam Long id){
         return ResponseEntity.ok(usuarioService.buscarUsuarioPorID(id));
     }

   @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId (@RequestParam Long id, @RequestBody String Usuario ){
        usuarioService.atualizarUsuarioPorID(id, usuario);
        return ResponseEntity.ok().build();
    }






}
