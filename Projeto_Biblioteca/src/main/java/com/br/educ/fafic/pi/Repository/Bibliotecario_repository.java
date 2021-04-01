package com.br.educ.fafic.pi.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Bibliotecario;

@Repository
public interface Bibliotecario_repository extends JpaRepository<Bibliotecario, UUID>{

}
