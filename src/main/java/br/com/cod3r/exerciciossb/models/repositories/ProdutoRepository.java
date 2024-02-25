package br.com.cod3r.exerciciossb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.exerciciossb.models.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>{ //nos genericos não pode usar tipo primitivo

	
	
}
