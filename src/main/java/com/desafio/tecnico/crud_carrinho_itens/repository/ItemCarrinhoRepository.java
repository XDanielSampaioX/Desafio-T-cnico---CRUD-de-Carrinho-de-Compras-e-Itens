package com.desafio.tecnico.crud_carrinho_itens.repository;

import com.desafio.tecnico.crud_carrinho_itens.model.Carrinho;
import com.desafio.tecnico.crud_carrinho_itens.model.ItemCarrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho, Long> {
    
}
