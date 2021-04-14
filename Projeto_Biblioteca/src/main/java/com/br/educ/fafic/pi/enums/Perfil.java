package com.br.educ.fafic.pi.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum Perfil {

    BIBLIOTECARIO(1, "ROLE_BIBLIOTECARIO"),
    PROFESSOR(2, "ROLE_PROFESSOR"),
    ALUNO(3, "ROLE_ALUNO");

        private Integer codigo;
        private String perfil;

        private Perfil(Integer codigo, String perfil){
            this.codigo = codigo;
            this.perfil = perfil;
        }

    @JsonValue
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @JsonCreator
    public static Perfil fromCodigo(Integer codigo) {
        return Arrays.stream(Perfil.values())
                .filter(e -> e.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);

    }
}
