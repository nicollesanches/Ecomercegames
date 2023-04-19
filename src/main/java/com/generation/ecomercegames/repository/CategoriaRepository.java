package com.generation.ecomercegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.ecomercegames.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllBycategoriaContainingIgnoreCase(@Param("categoria") String categoria);
}

