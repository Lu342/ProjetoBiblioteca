package com.br.educ.fafic.pi.Resources;

import java.util.UUID;

import com.br.educ.fafic.pi.Service.*;
import com.br.educ.fafic.pi.domain.*;
import com.br.educ.fafic.pi.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bibliotecario")
public class Bibliotecario_resource {

	@Autowired
	private Bibliotecario_service bibliotecario_service;

	@PostMapping("/Salvar_Bibliotecario")
	public ResponseEntity save(@RequestBody Bibliotecario_DTO bibliotecario) {
		return ResponseEntity.ok().body(bibliotecario_service.savebibliotecario(Bibliotecario.create(bibliotecario)));
	}

	@PutMapping("/Atualizar_Bibliotecario")
	public ResponseEntity updateBibliotecario(@RequestBody Bibliotecario bibliotecario) {
		return ResponseEntity.ok().body(bibliotecario_service.updateBibliotecario(bibliotecario));
	}

	@DeleteMapping("/Deletar_Bibliotecario/{uuid}")
	public ResponseEntity deleteBibliotecario(@PathVariable("uuid") UUID uuid) {
		bibliotecario_service.deleteBibliotecario(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@Autowired
	private Livro_servico livro_service;

	@PostMapping("/Salvar_Livro")
	public ResponseEntity save(@RequestBody Livro_DTO livro) {
		return ResponseEntity.ok().body(livro_service.saveLivro(Livro.create(livro)));
	}

	@GetMapping("/Buscar_Livro/ISBN/{isbn}")
	public ResponseEntity getLivroByIsbn(@PathVariable String isbn) {
		return ResponseEntity.ok().body(livro_service.getLivroByIsbn(isbn));
	}

	@GetMapping("/Buscar_Livro/Area/{area}")
	public ResponseEntity getLivroByArea(@PathVariable Integer area) {
		return ResponseEntity.ok().body(livro_service.getLivroByArea(area));
	}

	@GetMapping("/Buscar_Livro/Nome/{nome}")
	public ResponseEntity getLivroByNome(@PathVariable String nome) {
		return ResponseEntity.ok().body(livro_service.getLivroByNome(nome));
	}

	@DeleteMapping("/Deletar_Livro/UUID/{uuid}")
	public ResponseEntity deleteLivro(@PathVariable("uuid") UUID uuid) {
		livro_service.deleteLivro(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@PutMapping("/Atualizar_Livro")
	public ResponseEntity updateLivro(@RequestBody Livro livro) {
		return ResponseEntity.ok().body(livro_service.updateLivro(livro));
	}

	@Autowired
	private Aluno_servico aluno_service;

	@PostMapping("/Salvar_Aluno")
	public ResponseEntity save(@RequestBody Aluno_DTO aluno) {
		return ResponseEntity.ok().body(aluno_service.saveAluno(Aluno.create(aluno)));
	}

	@PutMapping("/Atualizar_Aluno")
	public ResponseEntity updateAluno(@RequestBody Aluno aluno) {
		return ResponseEntity.ok().body(aluno_service.updateAluno(aluno));
	}

	@GetMapping("/Buscar_Aluno/Matricula/{matricula}")
	public ResponseEntity getAlunoByMatricula(@PathVariable String matricula) {
		return ResponseEntity.ok().body(aluno_service.getAlunoByMatricula(matricula));
	}

	@GetMapping("/Buscar_Aluno/Nome/{nome}")
	public ResponseEntity getAlunoByNome(@PathVariable String nome) {
		return ResponseEntity.ok().body(aluno_service.getAlunoByNome(nome));
	}

	@DeleteMapping("/Deletar_Aluno/UUID/{uuid}")
	public ResponseEntity deleteAluno(@PathVariable("uuid") UUID uuid) {
		aluno_service.deleteAluno(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@Autowired
	private Professor_servico professor_service;

	@PostMapping("/Salvar_Professor")
	public ResponseEntity save(@RequestBody Professor_DTO professor) {
		return ResponseEntity.ok().body(professor_service.saveProfessor(Professor.create(professor)));
	}

	@PutMapping("/Atualizar_Professor")
	public ResponseEntity updateProfessor(@RequestBody Professor professor) {
		return ResponseEntity.ok().body(professor_service.updateProfessor(professor));
	}

	@GetMapping("/Buscar_Professor/matricula/{matricula}")
	public ResponseEntity getProfessorByMatricula(@PathVariable String matricula) {
		return ResponseEntity.ok().body(professor_service.getProfessorByMatricula(matricula));
	}

	@GetMapping("/Buscar_Professor/Nome/{nome}")
	public ResponseEntity getProfessorByNome(@PathVariable String nome) {
		return ResponseEntity.ok().body(professor_service.getProfessorByNome(nome));
	}

	@DeleteMapping("/Deletar_Professor/UUID/{uuid}")
	public ResponseEntity deleteProfessor(@PathVariable("uuid") UUID uuid) {
		professor_service.deleteProfessor(uuid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@Autowired
	private Movimentacao_servico movimentacao_service;

	@PostMapping("/Salvar_Movimentacao")
	public ResponseEntity save(@RequestBody Movimentacao_DTO movimentacao) {
		return ResponseEntity.ok().body(movimentacao_service.saveMovimentacao(Movimentacao.create(movimentacao)));
	}
}
