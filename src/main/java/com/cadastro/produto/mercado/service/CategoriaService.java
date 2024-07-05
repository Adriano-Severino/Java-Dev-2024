package com.cadastro.produto.mercado.service;

import com.cadastro.produto.mercado.models.Categoria;

public interface CategoriaService {

     Iterable<Categoria> buscarTodos();

     Categoria buscarPorId(Long id);

	void inserir(Categoria produto);

	void atualizar(Long id, Categoria produto);

	void deletar(Long id);

}
