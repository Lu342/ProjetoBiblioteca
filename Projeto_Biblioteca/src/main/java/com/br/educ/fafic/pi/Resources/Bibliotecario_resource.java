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
import com.br.educ.fafic.pi.Service.Bibliotecario_servico;
import com.br.educ.fafic.pi.Service.Livro_servico;
import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Bibliotecario;
import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.dto.Aluno_DTO;
import com.br.educ.fafic.pi.dto.Livro_DTO;
import com.br.educ.fafic.pi.dto.Bibliotecario_DTO;

@RestController
@RequestMapping(value = "/bibliotecario")
public class Bibliotecario_resource {

	@Autowired
	private Bibliotecario_servico bibliotecario_service;

	@PostMapping
	public ResponseEntity save(@RequestBody Bibliotecario_DTO bibliotecario) {
		return ResponseEntity.ok().body(bibliotecario_service.savebibliotecario(Bibliotecario.create(bibliotecario)));
	}

	/*
	 * @GetMapping("/get/{isbn}") public ResponseEntity getLivroByIsbn(@PathVariable
	 * String isbn) { return
	 * ResponseEntity.ok().body(livro_service.getLivroByIsbn(isbn)); }
	 */
	
	@DeleteMapping("/delete/{uuid}")
	public ResponseEntity deleteLivro(@PathVariable("uuid") UUID uuid) {
		bibliotecario_service.deleteBibliotecario(uuid);
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
