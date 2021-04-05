package com.br.educ.fafic.pi.Resources;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.educ.fafic.pi.Service.Professor_servico;
import com.br.educ.fafic.pi.Service.Livro_servico;
import com.br.educ.fafic.pi.Service.Professor_servico;
import com.br.educ.fafic.pi.domain.Professor;
import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.domain.Professor;
import com.br.educ.fafic.pi.dto.Professor_DTO;
import com.br.educ.fafic.pi.dto.Livro_DTO;
import com.br.educ.fafic.pi.dto.Professor_DTO;

@RestController
@RequestMapping(value = "/professor")
public class Professor_resource {

	@Autowired
	private Professor_servico professor_service;

	@PostMapping
	public ResponseEntity save(@RequestBody Professor_DTO professor) {
		return ResponseEntity.ok().body(professor_service.saveProfessor(Professor.create(professor)));
	}

	@GetMapping("/get/matricula/{matricula}")
	public ResponseEntity getProfessorByMatricula(@PathVariable String matricula) {
		return ResponseEntity.ok().body(professor_service.getProfessorByMatricula(matricula));
	}

	@GetMapping("/get/nome/{nome}")
	public ResponseEntity getProfessorByNome(@PathVariable String matricula) {
		return ResponseEntity.ok().body(professor_service.getProfessorByNome(matricula));
	}

	@DeleteMapping("/delete/{uuid}")
	public ResponseEntity deleteLivro(@PathVariable("uuid") UUID uuid) {
		professor_service.deleteProfessor(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
