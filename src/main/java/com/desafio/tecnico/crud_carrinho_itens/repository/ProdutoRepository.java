package com.desafio.tecnico.crud_carrinho_itens.repository;

import com.desafio.tecnico.crud_carrinho_itens.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
