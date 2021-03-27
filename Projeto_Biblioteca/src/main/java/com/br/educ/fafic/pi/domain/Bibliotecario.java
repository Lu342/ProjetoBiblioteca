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

	/* Tipo enum pra fazer */
	private Integer genero;

	/* colocar limitação de digitos */
	@Column(unique = true)
	private int matricula;

	@OneToOne(cascade = CascadeType.MERGE)
	private Endereco endereco;

	@Embedded
	private Contato contato;

	public Genero getGenero() {
		return Genero.fromCodigo(genero);
	}

	public void setGenero(Genero genero) {
		this.genero = genero.getCodigo();
	}
	
}
