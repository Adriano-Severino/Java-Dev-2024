package com.cadastro.produto.mercado.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Produto")
public class Produto {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
    private String descricao;
    private BigDecimal preco;
    @ManyToOne
    private Categoria categoria;
}
