package com.cadastro.produto.mercado.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.produto.mercado.models.Categoria;
import com.cadastro.produto.mercado.repositoy.CategoriaRepository;
import com.cadastro.produto.mercado.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

     @Autowired
	private CategoriaRepository categoriaRepository;

    @Override
    public Iterable<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria buscarPorId(Long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.get();
    }

    @Override
    public void inserir(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void atualizar(Long id, Categoria categoria) {
       Optional<Categoria> categoriaBd = categoriaRepository.findById(id);
    if (categoriaBd.isPresent()) {
        Categoria produtoExistente = categoriaBd.get();
        produtoExistente.setNome(categoria.getNome());
        categoriaRepository.save(produtoExistente);
    }
    }

    @Override
    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }

}
