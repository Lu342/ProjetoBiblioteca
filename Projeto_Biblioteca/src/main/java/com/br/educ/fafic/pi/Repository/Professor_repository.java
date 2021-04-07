package com.br.educ.fafic.pi.Repository;

import java.util.UUID;

import com.br.educ.fafic.pi.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.educ.fafic.pi.domain.Professor;

@Repository
public interface Professor_repository extends JpaRepository<Professor, UUID> {
    public Professor findByMatricula(String matricula);
    public Professor findByNome(String nome);
}
