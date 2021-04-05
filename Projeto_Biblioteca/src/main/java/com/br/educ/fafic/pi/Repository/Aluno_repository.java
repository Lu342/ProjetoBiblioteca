package com.br.educ.fafic.pi.Repository;

import java.util.UUID;

import com.br.educ.fafic.pi.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.educ.fafic.pi.domain.Aluno;

@Repository
public interface Aluno_repository extends JpaRepository<Aluno, UUID> {
	
	public Aluno findByMatricula(String matricula);

	public Aluno findByNome(String nome);
}
