package com.br.educ.fafic.pi.Resources;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.educ.fafic.pi.Service.Aluno_servico;
import com.br.educ.fafic.pi.Service.Livro_servico;
import com.br.educ.fafic.pi.Service.Professor_servico;
import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.domain.Professor;
import com.br.educ.fafic.pi.dto.Aluno_DTO;
import com.br.educ.fafic.pi.dto.Livro_DTO;
import com.br.educ.fafic.pi.dto.Professor_DTO;

// recebe a chamada do front-end

@RestController
@RequestMapping(value = "/professor")
public class Professor_resource {

	@Autowired
	private Professor_servico professor_service;

	@PostMapping
	public ResponseEntity save(@RequestBody Professor_DTO professor) {
		return ResponseEntity.ok().body(professor_service.saveProfessor(Professor.create(professor)));
	}

	/*
	 * @GetMapping("/get/{isbn}") public ResponseEntity getLivroByIsbn(@PathVariable
	 * String isbn) { return
	 * ResponseEntity.ok().body(livro_service.getLivroByIsbn(isbn)); }
	 */
	
	@DeleteMapping("/delete/{uuid}")
	public ResponseEntity deleteLivro(@PathVariable("uuid") UUID uuid) {
		professor_service.deleteProfessor(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	/*
	 * @GetMapping("/all") 
	 * public List<Livro> getAll() { 
	 * return (List<Livro>)
	 * ResponseEntity.ok().body(livro_service.getAll());
	 * 
	 * }  
	 */
	
//	recurso para cada entidade
}
