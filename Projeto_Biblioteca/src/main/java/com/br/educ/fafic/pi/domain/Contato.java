package com.br.educ.fafic.pi.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Contato implements Serializable {

	private String email, telefone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
