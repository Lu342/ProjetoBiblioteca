package com.br.educ.fafic.pi.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Usuarios implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	private Aluno aluno;
	private Professor professor;
	private Bibliotecario bibliotecario;

}
