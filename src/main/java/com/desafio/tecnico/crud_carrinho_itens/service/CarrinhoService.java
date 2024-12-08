package com.desafio.tecnico.crud_carrinho_itens.service;

import java.util.List;

import com.desafio.tecnico.crud_carrinho_itens.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.tecnico.crud_carrinho_itens.model.Carrinho;

@Service
public class CarrinhoService{

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho salvar(Carrinho carrinho) {
        return carrinhoRepository.saveAndFlush(carrinho);
    }

    public Carrinho atualizar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }
    
    public List<Carrinho> listarTodos() {
        return carrinhoRepository.findAll();
    }

    public Carrinho buscar(long id) {
        return carrinhoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item não encontrado"));
    }
    
    public void deletar(Long id) {
        carrinhoRepository.deleteById(id);
    }
}
