package com.desafio.tecnico.crud_carrinho_itens.service;

import com.desafio.tecnico.crud_carrinho_itens.model.ItemCarrinho;
import com.desafio.tecnico.crud_carrinho_itens.repository.ItemCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCarrinhoService{

    @Autowired
    private ItemCarrinhoRepository itemCarrinhoRepository;

    public ItemCarrinho salvar(ItemCarrinho itemCarrinho) {
        return itemCarrinhoRepository.save(itemCarrinho);
    }

    public ItemCarrinho atualizar(ItemCarrinho itemCarrinho) {
        return itemCarrinhoRepository.save(itemCarrinho);
    }

    public List<ItemCarrinho> listarTodos() {
        return itemCarrinhoRepository.findAll();
    }

    public ItemCarrinho buscar(long id) {
        return itemCarrinhoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item não encontrado"));
    }

    public void deletar(Long id) {
        itemCarrinhoRepository.deleteById(id);
    }
}
