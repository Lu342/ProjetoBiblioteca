package com.br.educ.fafic.pi.domain;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;

	@OneToOne
	private Usuarios usuario;

	private Calendar dataEmprestimo;
	private Calendar dataDevolucao;

	@OneToMany
	private List<Livro> livrosAlocados;
	private Double multa;

//	 multa diária de 2,00 para cada dia (se tiver)
//   Usar o relógio do computador como base.
}
