package com.br.educ.fafic.pi.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.educ.fafic.pi.Repository.Bibliotecario_repository;
import com.br.educ.fafic.pi.domain.Bibliotecario;

@Service
public class Bibliotecario_servico {
	private final Bibliotecario_repository bibliotecario_repository;

	@Autowired
	public Bibliotecario_servico(Bibliotecario_repository bibliotecario_repository) {
		this.bibliotecario_repository = bibliotecario_repository;
	}

	public Bibliotecario savebibliotecario(Bibliotecario bibliotecario) {
		return bibliotecario_repository.save(bibliotecario);
	}

	public List<Bibliotecario> getAll() {
		return bibliotecario_repository.findAll();
	}

}
