package com.br.educ.fafic.pi.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.modelmapper.ModelMapper;

import com.br.educ.fafic.pi.dto.Livro_DTO;
import com.br.educ.fafic.pi.enums.Area;
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
public class Livro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;

	private String nome;

	@Column(unique = true)
	private String isbn;

	private Integer area;

	public static Livro create(Livro_DTO livrodto) {
		return new ModelMapper().map(livrodto, Livro.class);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public UUID getUuid() {
		return uuid;
	}

	public Area getArea() {
		return Area.fromCodigo(area);
	}

	public void setArea(Area area) {
		this.area = area.getCodigo();
	}

}
