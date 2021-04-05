package com.br.educ.fafic.pi.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.educ.fafic.pi.domain.Livro;

@Repository
public interface Livro_repository extends JpaRepository<Livro, UUID> {
	public Livro findByIsbn(String isbn);
	public Livro findByArea(Integer area);
	public Livro findByNome(String nome);
}
