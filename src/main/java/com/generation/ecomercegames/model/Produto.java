package com.generation.ecomercegames.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@PositiveOrZero
	@NotNull(message = "O atributo nome é obrigatório")
    private String nome;
    
	
	@NotNull(message = "O atributo preço é obrigatório")
	private BigDecimal preço; 
	
	private String foto;
	
	@NotNull(message = "O atributo plataforma é obrigatório")
	private String plataforma;
	
	@NotNull(message = "O atributo data é obrigatório")
	private Date lançamento_data; 
	
	
	
	
	
	
}
