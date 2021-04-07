package com.br.educ.fafic.pi.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

@JsonFormat(shape = JsonFormat.Shape.NUMBER)
public enum Area {

	HUMANAS(1, "Humanas"), EXATAS(2, "Exatas");

	private Integer codigo;
	private String valor;

	Area(Integer codigo, String valor) {
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
	public static Area fromCodigo(Integer codigo) {
		return Arrays.stream(Area.values()).filter(e -> e.getCodigo().equals(codigo)).findFirst().orElse(null);

	}
}
