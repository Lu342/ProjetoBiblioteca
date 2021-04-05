package com.br.educ.fafic.pi.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
public class Biblioteca implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;

	private String nome;

	private String instituicao;

	@OneToOne
	private Bibliotecario bibliotecario;

	@OneToMany
	private List<Livro> livros;

	@OneToMany
	private List<Usuarios> usuários;

}
