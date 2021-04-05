package com.br.educ.fafic.pi.Service;

import com.br.educ.fafic.pi.Repository.Movimentacao_repository;
import com.br.educ.fafic.pi.domain.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Movimentacao_servico {

	private final Movimentacao_repository movimentacao_repository;

	@Autowired
	public Movimentacao_servico(Movimentacao_repository movimentacao_repository) {
		this.movimentacao_repository = movimentacao_repository;
	}

	public Movimentacao saveMovimentacao(Movimentacao movimentacao) {
		return movimentacao_repository.save(movimentacao);
	}

}
