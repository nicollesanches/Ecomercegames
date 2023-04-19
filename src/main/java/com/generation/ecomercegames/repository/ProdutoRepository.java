package com.generation.ecomercegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.ecomercegames.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findAllByProdutoContainingIgnoreCase(@Param("produto") String produto);
	
}