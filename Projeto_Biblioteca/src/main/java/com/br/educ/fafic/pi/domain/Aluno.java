package com.br.educ.fafic.pi.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.modelmapper.ModelMapper;

import com.br.educ.fafic.pi.dto.Aluno_DTO;
import com.br.educ.fafic.pi.dto.Livro_DTO;
import com.br.educ.fafic.pi.enums.Genero;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Aluno implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;

	private String nome;

	/* limitar o cpf a 11 digitos */
	@Column(unique = true)
	private String cpf;

	private Integer genero;

	@Column(unique = true)
	private String matricula;

	@OneToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST })
	private Endereco endereco;

	@Embedded
	private Contato contato;


	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private CursoAluno curso;

	public static Aluno create(Aluno_DTO alunodto) {
		return new ModelMapper().map(alunodto, Aluno.class);
	}

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

	public UUID getUuid() {
		return uuid;
	}

	public Genero getGenero() {
		return Genero.fromCodigo(genero);
	}

	public void setGenero(Genero genero) {
		this.genero = genero.getCodigo();
	}

}
