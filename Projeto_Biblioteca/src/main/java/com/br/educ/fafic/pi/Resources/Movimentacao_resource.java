package com.br.educ.fafic.pi.Resources;

import com.br.educ.fafic.pi.Service.Aluno_servico;
import com.br.educ.fafic.pi.Service.Movimentacao_servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movimentacao")
public class Movimentacao_resource {

    @Autowired
    private Movimentacao_servico movimentacao_service;

}
