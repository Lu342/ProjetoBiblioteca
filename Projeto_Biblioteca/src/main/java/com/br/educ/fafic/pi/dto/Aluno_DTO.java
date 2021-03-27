package com.br.educ.fafic.pi.dto;

import com.br.educ.fafic.pi.domain.Contato;
import com.br.educ.fafic.pi.domain.CursoAluno;
import com.br.educ.fafic.pi.domain.Endereco;
import com.br.educ.fafic.pi.enums.Genero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Aluno_DTO {

	private String nome;

	private String cpf;

	private String matricula;

	private Endereco endereco;

	private Contato contato;

	private CursoAluno curso;

	private Genero genero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public CursoAluno getCurso() {
		return curso;
	}

	public void setCurso(CursoAluno curso) {
		this.curso = curso;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
