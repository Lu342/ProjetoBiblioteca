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
import javax.persistence.OneToOne;

import org.modelmapper.ModelMapper;

import com.br.educ.fafic.pi.dto.Aluno_DTO;
import com.br.educ.fafic.pi.dto.Bibliotecario_DTO;
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
public class Bibliotecario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;

	private String nome;

	@Column(unique = true)
	private String CPF;

	private Integer genero;

	/* colocar limita��o de digitos */
	@Column(unique = true)
	private int matricula;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	@Embedded
	private Contato contato;

	@Embedded
	private Login login;

	public static Bibliotecario create(Bibliotecario_DTO bibliotecariodto) {
		return new ModelMapper().map(bibliotecariodto, Bibliotecario.class);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
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

	public UUID getUuid() {
		return uuid;
	}

	public Genero getGenero() {
		return Genero.fromCodigo(genero);
	}

	public void setGenero(Genero genero) {
		this.genero = genero.getCodigo();
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
}
