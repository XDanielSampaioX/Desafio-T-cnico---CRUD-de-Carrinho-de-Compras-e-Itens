package com.desafio.tecnico.crud_carrinho_itens.controller;

import java.util.List;

import com.desafio.tecnico.crud_carrinho_itens.model.ItemCarrinho;
import com.desafio.tecnico.crud_carrinho_itens.service.ItemCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.desafio.tecnico.crud_carrinho_itens.model.Carrinho;
import com.desafio.tecnico.crud_carrinho_itens.service.CarrinhoService;

@RestController
@RequestMapping("/carrinhos")
public class CarrinhoController {


    @Autowired
    private CarrinhoService carrinhoService;

    @Autowired
    private ItemCarrinhoService itemCarrinhoService;


    @PostMapping
    public Carrinho salvar(@RequestBody Carrinho carrinho) {
        return carrinhoService.salvar(carrinho);
    }

    @PutMapping("/{id}")
    public Carrinho atualizar(@PathVariable long id, @RequestBody Carrinho carrinho) {
        return carrinhoService.atualizar(id, carrinho);
    }

    @GetMapping
    public List<Carrinho> listarTodos() {
        return carrinhoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Carrinho buscar(@PathVariable long id) {
        return carrinhoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        carrinhoService.deletar(id);
    }


    // --------------------------------------------------
    // Itens
    //---------------------------------------------------

    @PostMapping("/{id}/itens")
    public ItemCarrinho salvar(@RequestBody ItemCarrinho itemCarrinho) {
        return itemCarrinhoService.salvar(itemCarrinho);
    }

//    @PutMapping("/{id}/itens/{idItem}")
//    public ItemCarrinho atualizar(@PathVariable Long id, @PathVariable Long idItem, @RequestBody int quantidade) {
//        return itemCarrinhoService.atualizar(id, idItem, quantidade);
//    }
//
//    @GetMapping("/{id}/itens")
//    public List<ItemCarrinho> listarTodosItens() {
//        return itemCarrinhoService.listarTodosItens();
//    }
//
//    @GetMapping("/{id}/itens/{idItem}")
//    public ItemCarrinho buscarItem(@PathVariable long id, @PathVariable long idItem) {
//        return itemCarrinhoService.buscarItem(id);
//    }
//
//    @DeleteMapping("/{id}/itens/{id}")
//    public void deletar(@PathVariable Long id) {
//        carrinhoService.deletar(id);
//    }
}
