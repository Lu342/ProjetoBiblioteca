package com.br.educ.fafic.pi.Resources;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.educ.fafic.pi.Service.Livro_servico;
import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.dto.Livro_DTO;

// recebe a chamada do front-end

@RestController
@RequestMapping(value = "/livro")
public class Livro_resource {

	@Autowired
	private Livro_servico livro_service;

	@PostMapping
	public ResponseEntity save(@RequestBody Livro_DTO livro) {
		return ResponseEntity.ok().body(livro_service.saveLivro(Livro.create(livro)));
	}

	@GetMapping("/get/{isbn}")
	public ResponseEntity getLivroByIsbn(@PathVariable String isbn) {
		return ResponseEntity.ok().body(livro_service.getLivroByIsbn(isbn));
	}

	@DeleteMapping("/delete/{uuid}")
	public ResponseEntity deleteLivro(@PathVariable("uuid") UUID uuid) {
		livro_service.deleteLivro(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	/*
	 * @GetMapping("/all") public List<Livro> getAll() { return (List<Livro>)
	 * ResponseEntity.ok().body(livro_service.getAll());
	 * 
	 * }
	 */

//	recurso para cada entidade
}
