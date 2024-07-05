package com.cadastro.produto.mercado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cadastro.produto.mercado.models.Categoria;
import com.cadastro.produto.mercado.service.CategoriaService;

@RestController
@RequestMapping("v1/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<Iterable<Categoria>> listaProdutos(){
        return ResponseEntity.ok(categoriaService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(categoriaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Categoria> inserir(@RequestBody Categoria categoria) {
		categoriaService.inserir(categoria);
		return ResponseEntity.ok(categoria);
    }

    @PutMapping("/{id}")
	public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
		categoriaService.atualizar(id, categoria);
		return ResponseEntity.ok(categoria);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		categoriaService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
