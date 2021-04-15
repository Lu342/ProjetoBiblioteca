package com.br.educ.fafic.pi.Service;

import com.br.educ.fafic.pi.Repository.Bibliotecario_repository;
import com.br.educ.fafic.pi.domain.Bibliotecario;
import com.br.educ.fafic.pi.security.UserSpringSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private Bibliotecario_repository bibliotecario_repository;

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        Optional<Bibliotecario> bibliotecario = bibliotecario_repository.userByUsuario(usuario);
        if(bibliotecario.isPresent()){
            return new UserSpringSecurity(bibliotecario.get().getUuid(),
                    bibliotecario.get().getLogin().getUsuario(),
                    bibliotecario.get().getLogin().getSenha(),
                    bibliotecario.get().getLogin().getPerfis());
        }
        return null;
    }
}
