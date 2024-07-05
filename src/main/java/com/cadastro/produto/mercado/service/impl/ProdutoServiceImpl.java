package com.cadastro.produto.mercado.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.produto.mercado.models.Produto;
import com.cadastro.produto.mercado.repositoy.ProdutoRepositoy;
import com.cadastro.produto.mercado.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
	private ProdutoRepositoy produtoRepository;

    @Override
    public Iterable<Produto> buscarTodos() {
       return produtoRepository.findAll();
    }

    @Override
    public Produto buscarPorId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
		return produto.get();
    }

    @Override
    public void inserir(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void atualizar(Long id, Produto produto) {
        Optional<Produto> produtoBd = produtoRepository.findById(id);
        if (produtoBd.isPresent()) {
            Produto produtoExistente = produtoBd.get();
            produtoExistente.setNome(produto.getNome());
            produtoExistente.setDescricao(produto.getDescricao());
            produtoExistente.setPreco(produto.getPreco());
            produtoRepository.save(produtoExistente);
        }
    }

    @Override
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }

}
