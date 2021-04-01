package com.br.educ.fafic.pi.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.educ.fafic.pi.Repository.Aluno_repository;
import com.br.educ.fafic.pi.domain.Aluno;

@Service
public class Aluno_servico {

	private final Aluno_repository aluno_repository ;

	@Autowired
	public Aluno_servico(Aluno_repository aluno_repository) {
		this.aluno_repository = aluno_repository;
	}

	public Aluno saveAluno(Aluno aluno) {
		return aluno_repository.save(aluno);
	}

	public List<Aluno> getAll() {
		return aluno_repository.findAll();
	}

	/* public DELETE */

}