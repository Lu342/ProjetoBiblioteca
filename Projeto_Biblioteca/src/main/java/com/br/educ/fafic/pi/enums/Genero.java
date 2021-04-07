package com.br.educ.fafic.pi.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum Genero {

	MASCULINO(1, "Masculino"), FEMININO(2, "Feminino");

	private Integer codigo;
	private String valor;

	Genero(Integer codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	@JsonValue
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@JsonCreator
	public static Genero fromCodigo(Integer codigo) {
		return Arrays.stream(Genero.values()).filter(e -> e.getCodigo().equals(codigo)).findFirst().orElse(null);

	}

}
