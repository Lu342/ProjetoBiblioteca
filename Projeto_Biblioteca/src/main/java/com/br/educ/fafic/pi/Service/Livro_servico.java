package com.br.educ.fafic.pi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.br.educ.fafic.pi.Repository.Livro_repository;
import com.br.educ.fafic.pi.domain.Livro;

@Service
public class Livro_servico {

	private final Livro_repository livro_repository;

	@Autowired
	public Livro_servico(Livro_repository livro_repository) {
		this.livro_repository = livro_repository;
	}

	public Livro saveLivro(Livro livro) {
		return livro_repository.save(livro);
	}
	
	public List<Livro> getAll(){
	 	return  livro_repository.findAll();
	 }
	 
	
	/*public DELETE*/

}
