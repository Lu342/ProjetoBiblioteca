package com.br.educ.fafic.pi.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.educ.fafic.pi.Repository.Aluno_repository;
import com.br.educ.fafic.pi.Repository.Bibliotecario_repository;
import com.br.educ.fafic.pi.Repository.Livro_repository;
import com.br.educ.fafic.pi.Repository.Movimentacao_repository;
import com.br.educ.fafic.pi.Repository.Professor_repository;
import com.br.educ.fafic.pi.domain.Aluno;
import com.br.educ.fafic.pi.domain.Bibliotecario;
import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.domain.Movimentacao;
import com.br.educ.fafic.pi.domain.Professor;

@Service
public class Bibliotecario_service {


	private final Bibliotecario_repository bibliotecario_repository;
	private final Movimentacao_repository movimentacao_repository;
	private final Professor_repository professor_repository;	
	private final Aluno_repository aluno_repository;
	private final Livro_repository livro_repository;

	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public Bibliotecario_service(Bibliotecario_repository bibliotecario_repository, Aluno_repository aluno_repository, Livro_repository livro_repository, Professor_repository professor_repository, Movimentacao_repository movimentacao_repository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.bibliotecario_repository = bibliotecario_repository;
		this.movimentacao_repository = movimentacao_repository;
		this.professor_repository = professor_repository;
		this.aluno_repository = aluno_repository;
		this.livro_repository = livro_repository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}


	public Bibliotecario savebibliotecario(Bibliotecario bibliotecario) {
		bibliotecario.getLogin().setSenha(bCryptPasswordEncoder.encode(bibliotecario.getLogin().getSenha()));
		return bibliotecario_repository.save(bibliotecario);
	}
	
	public Bibliotecario updateBibliotecario(Bibliotecario bibliotecario) {
		return bibliotecario_repository.save(bibliotecario);
	}

	public List<Bibliotecario> Buscar_Bibliotecarios() {
		return bibliotecario_repository.findAll();
	}

	public void deleteBibliotecario(UUID uuid) {
		Bibliotecario bibliotecario = bibliotecario_repository.getOne(uuid);
		bibliotecario_repository.delete(bibliotecario);
	}
	
	
	public Aluno saveAluno(Aluno aluno) {
		return aluno_repository.save(aluno);
	}
	
	public Aluno updateAluno(Aluno aluno) {
		return aluno_repository.save(aluno);
	}

	public List<Aluno> Buscar_Alunos() {
		return aluno_repository.findAll();
	}

	public Aluno getAlunoByMatricula(String matricula) {
		return aluno_repository.findByMatricula(matricula);
	}

	public Aluno getAlunoByNome(String nome) {
		return aluno_repository.findByNome(nome);
	}

	public void deleteAluno(UUID uuid) {
		Aluno aluno = aluno_repository.getOne(uuid);
		aluno_repository.delete(aluno);
	}
	

	public Livro saveLivro(Livro livro) {
		return livro_repository.save(livro);
	}
	
	public Livro updateLivro(Livro livro) {
		return livro_repository.save(livro);
	}

	public Livro getLivroByIsbn(String isbn) {
		return livro_repository.findByIsbn(isbn);
	}

	public Livro getLivroByArea(Integer area) {
		return livro_repository.findByArea(area);
	}

	public Livro getLivroByNome(String nome) {
		return livro_repository.findByNome(nome);
	}

	public void deleteLivro(UUID uuid) {
		Livro livro = livro_repository.getOne(uuid);
		livro_repository.delete(livro);
	}
	
	public Professor saveProfessor(Professor professor) {
		return professor_repository.save(professor);
	}
	
	public Professor updateProfessor(Professor professor) {
		return professor_repository.save(professor);
	}

	public Professor getProfessorByMatricula(String matricula) {
		return professor_repository.findByMatricula(matricula);
	}

	public Professor getProfessorByNome(String nome) {
		return professor_repository.findByMatricula(nome);
	}

	public List<Professor> getAll() {
		return professor_repository.findAll();
	}

	public void deleteProfessor(UUID uuid) {
		Professor professor = professor_repository.getOne(uuid);
		professor_repository.delete(professor);
	}
	
	public Movimentacao saveMovimentacao(Movimentacao movimentacao) {
		return movimentacao_repository.save(movimentacao);
	}

}
