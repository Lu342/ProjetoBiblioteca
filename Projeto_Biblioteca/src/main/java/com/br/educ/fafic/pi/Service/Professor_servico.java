package com.br.educ.fafic.pi.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.educ.fafic.pi.Repository.Aluno_repository;
import com.br.educ.fafic.pi.Repository.Professor_repository;
import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Professor;

@Service
public class Professor_servico {

	private final Professor_repository professor_repository ;

	@Autowired
	public Professor_servico(Professor_repository professor_repository) {
		this.professor_repository = professor_repository;
	}

	public Professor saveProfessor(Professor professor) {
		return professor_repository.save(professor);
	}

	public List<Professor> getAll() {
		return professor_repository.findAll();
	}

	/* public DELETE */

}
