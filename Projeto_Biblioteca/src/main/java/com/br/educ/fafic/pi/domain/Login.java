package com.br.educ.fafic.pi.domain;

import com.br.educ.fafic.pi.enums.Perfil;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.stream.Collectors;

@Embeddable
public class Login {

    private String usuario;
    private String senha;

    @CollectionTable(name = "perfis")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> perfis;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Perfil> getPerfis() {
        return perfis.stream().map(p -> Perfil.fromCodigo(p)).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil){
        perfis.add(perfil.getCodigo());
    }

}
