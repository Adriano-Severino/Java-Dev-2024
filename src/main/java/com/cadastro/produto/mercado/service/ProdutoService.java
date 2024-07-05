package com.cadastro.produto.mercado.service;

import com.cadastro.produto.mercado.models.Produto;

public interface ProdutoService {

    Iterable<Produto> buscarTodos();

	Produto buscarPorId(Long id);

	void inserir(Produto cliente);

	void atualizar(Long id, Produto cliente);

	void deletar(Long id);

}
