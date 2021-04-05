package com.br.educ.fafic.pi.Resources;

import com.br.educ.fafic.pi.Service.Aluno_servico;
import com.br.educ.fafic.pi.Service.Movimentacao_servico;
import com.br.educ.fafic.pi.domain.Movimentacao;
import com.br.educ.fafic.pi.dto.Movimentacao_DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movimentacao")
public class Movimentacao_resource {

	@Autowired
	private Movimentacao_servico movimentacao_service;

	@PostMapping
	public ResponseEntity save(@RequestBody Movimentacao_DTO movimentacao) {
		return ResponseEntity.ok().body(movimentacao_service.saveMovimentacao(Movimentacao.create(movimentacao)));
	}


}
