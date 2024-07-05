package com.cadastro.produto.mercado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cadastro.produto.mercado.models.Produto;
import com.cadastro.produto.mercado.service.ProdutoService;


@RestController
@RequestMapping("v1/api/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<Iterable<Produto>> listaProdutos(){
        return ResponseEntity.ok(produtoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Produto> inserir(@RequestBody Produto produto) {
		produtoService.inserir(produto);
		return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
	public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		produtoService.atualizar(id, produto);
		return ResponseEntity.ok(produto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		produtoService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
