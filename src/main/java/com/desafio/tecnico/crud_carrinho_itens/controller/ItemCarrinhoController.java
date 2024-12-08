package com.desafio.tecnico.crud_carrinho_itens.controller;

import java.util.List;

import com.desafio.tecnico.crud_carrinho_itens.model.ItemCarrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.tecnico.crud_carrinho_itens.service.ItemCarrinhoService;

@RestController
@RequestMapping("/carrinhos/{id}/itens")
public class ItemCarrinhoController {
    
    @Autowired
    private ItemCarrinhoService itemCarrinhoService;

    @PostMapping
    public ItemCarrinho salvar(@RequestBody ItemCarrinho itemCarrinho) {
        return itemCarrinhoService.salvar(itemCarrinho);
    }

    @PutMapping("/{itemId}")
    public ItemCarrinho atualizar(@RequestBody ItemCarrinho itemCarrinho) {
        return itemCarrinhoService.salvar(itemCarrinho);
    }

    @GetMapping
    public List<ItemCarrinho> listarTodos() {
        try {
            return itemCarrinhoService.listarTodos();
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/{itemId}")
    public ItemCarrinho buscar(@PathVariable long id) {
        try {
            return itemCarrinhoService.buscar(id);
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/{itemId}")
    public void deletar(@PathVariable Long id) {
        try {
            itemCarrinhoService.deletar(id);
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
        }
    }
}
