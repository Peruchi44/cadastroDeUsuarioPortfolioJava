package com.java.github.fernandoperuchi.cadastrodeusuario.infrastructure.repository;

import com.java.github.fernandoperuchi.cadastrodeusuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);


}
