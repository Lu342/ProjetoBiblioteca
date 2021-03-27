package com.br.educ.fafic.pi.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.educ.fafic.pi.enums.Area;
import com.br.educ.fafic.pi.enums.Genero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CursoProfessor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	
	private String nome;
	private Integer area;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Area getArea() {
		return Area.fromCodigo(area);
	}

	public void setArea(Area area) {
		this.area = area.getCodigo();
	}

	public UUID getUuid() {
		return uuid;
	}

}
