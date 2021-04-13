package com.br.educ.fafic.pi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static final String [] PUBLIC_MATCHERS = {
            "/bibliotecario/**"
    };

    public static final String [] PUBLIC_MATCHERS_GET = {
            "/bibliotecario/**"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET,PUBLIC_MATCHERS_GET).permitAll()
                .anyRequest().authenticated();
    }
}
