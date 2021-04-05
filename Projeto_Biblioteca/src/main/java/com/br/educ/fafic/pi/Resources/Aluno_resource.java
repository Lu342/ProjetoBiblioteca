package com.br.educ.fafic.pi.Resources;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.educ.fafic.pi.Service.Aluno_servico;
import com.br.educ.fafic.pi.Service.Livro_servico;
import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.dto.Aluno_DTO;
import com.br.educ.fafic.pi.dto.Livro_DTO;

@RestController
@RequestMapping(value = "/aluno")
public class Aluno_resource {

	@Autowired
	private Aluno_servico aluno_service;

	@PostMapping
	public ResponseEntity save(@RequestBody Aluno_DTO aluno) {
		return ResponseEntity.ok().body(aluno_service.saveAluno(Aluno.create(aluno)));
	}

	@PutMapping("/update")
	public ResponseEntity updateAluno(@RequestBody Aluno aluno) {
		return ResponseEntity.ok().body(aluno_service.updateAluno(aluno));
	}

	@GetMapping("/get/matricula/{matricula}")
	public ResponseEntity getAlunoByMatricula(@PathVariable String matricula) {
		return ResponseEntity.ok().body(aluno_service.getAlunoByMatricula(matricula));
	}

	@GetMapping("/get/nome/{nome}")
	public ResponseEntity getAlunoByNome(@PathVariable String matricula) {
		return ResponseEntity.ok().body(aluno_service.getAlunoByNome(matricula));
	}

	@DeleteMapping("/delete/{uuid}")
	public ResponseEntity deleteLivro(@PathVariable("uuid") UUID uuid) {
		aluno_service.deleteAluno(uuid);
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
