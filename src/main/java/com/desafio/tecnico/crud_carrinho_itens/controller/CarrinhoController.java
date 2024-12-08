package com.desafio.tecnico.crud_carrinho_itens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.desafio.tecnico.crud_carrinho_itens.model.Carrinho;
import com.desafio.tecnico.crud_carrinho_itens.service.CarrinhoService;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/carrinhos")
public class CarrinhoController{

    
    @Autowired
    private CarrinhoService carrinhoService;
    

    @PostMapping
    public ResponseEntity<Carrinho> salvar(@RequestBody Carrinho carrinho) {
        return ResponseEntity.status(CREATED).body(carrinhoService.salvar(carrinho));
    }

    @PutMapping("/{id}")
    public Carrinho atualizar(@PathVariable long id, @RequestBody Carrinho carrinho) {
        try {
            return carrinhoService.atualizar(carrinho);
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping
    public List<Carrinho> listarTodos() {
        try {
            return carrinhoService.listarTodos();
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/{id}")
    public Carrinho buscar(@PathVariable long id) {
        try {
            return carrinhoService.buscar(id);
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        try {
            carrinhoService.deletar(id);
        } catch (Exception e) {
            // Log do erro
            e.printStackTrace();
        }
    }
}
