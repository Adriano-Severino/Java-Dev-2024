
package com.cadastro.produto.mercado.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cadastro.produto.mercado.models.Produto;

@Repository
public interface ProdutoRepositoy extends JpaRepository<Produto, Long> {

}
