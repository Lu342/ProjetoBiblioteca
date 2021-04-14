package com.br.educ.fafic.pi.security;

import com.br.educ.fafic.pi.enums.Perfil;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserSpringSecurity implements UserDetails {

    private UUID id;
    private String usuario;
    private String senha;
    private Collection<? extends GrantedAuthority> authorities;

    public UserSpringSecurity() {
    }

    public UserSpringSecurity(UUID id, String usuario, String senha, Set<Perfil> perfis) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.authorities = perfis.stream().map(perfil -> new SimpleGrantedAuthority(perfil.getPerfil())).collect(Collectors.toList());
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return usuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
