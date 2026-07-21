package com.java.github.fernandoperuchi.cadastrodeusuario.controller;

import com.java.github.fernandoperuchi.cadastrodeusuario.business.UsuarioService;
import com.java.github.fernandoperuchi.cadastrodeusuario.infrastructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestParam String email) {
        usuarioService.deletarUsuarioEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizarUsuario(@RequestParam Integer id,
                                                    @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioId(id, usuario);
        return ResponseEntity.ok().build();
    }
}


