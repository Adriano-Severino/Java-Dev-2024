package com.cadastro.produto.mercado.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

}
