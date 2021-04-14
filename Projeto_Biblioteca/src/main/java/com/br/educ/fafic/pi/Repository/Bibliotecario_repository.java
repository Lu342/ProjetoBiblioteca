package com.br.educ.fafic.pi.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Bibliotecario;

@Repository
public interface Bibliotecario_repository extends JpaRepository<Bibliotecario, UUID> {

    @Query("Select b from Bibliotecario b where b.login.usuario=:usuario")
    public Optional<Bibliotecario> userByUsuario(@Param("usuario") String usuario);
}
