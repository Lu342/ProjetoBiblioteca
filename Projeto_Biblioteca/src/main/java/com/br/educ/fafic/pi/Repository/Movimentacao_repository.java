package com.br.educ.fafic.pi.Repository;

import com.br.educ.fafic.pi.domain.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Movimentacao_repository extends JpaRepository<Movimentacao, UUID> {

}
