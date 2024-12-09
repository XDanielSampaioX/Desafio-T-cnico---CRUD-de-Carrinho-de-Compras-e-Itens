package com.desafio.tecnico.crud_carrinho_itens.service;

import java.time.LocalDateTime;
import java.util.List;

import com.desafio.tecnico.crud_carrinho_itens.model.enums.StatusCarrinho;
import com.desafio.tecnico.crud_carrinho_itens.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.tecnico.crud_carrinho_itens.model.Carrinho;

@Service
public class CarrinhoService{

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho salvar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public Carrinho atualizar(Long idCarrinho, Carrinho carrinho) {
        Carrinho carrinhoExistente = buscar(idCarrinho);
        carrinhoExistente.setClienteNome(carrinho.getClienteNome());
        carrinhoExistente.setAtualizadoEm(LocalDateTime.now());
        return carrinhoRepository.save(carrinhoExistente);
    }
    
    public List<Carrinho> listarTodos() {
        return carrinhoRepository.findAll();
    }

    public Carrinho buscar(Long id) {
        return carrinhoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item não encontrado"));
    }
    
    public void deletar(Long id) {
        Carrinho carrinhoExistente = buscar(id);
        carrinhoExistente.setStatus(StatusCarrinho.INATIVO);
        carrinhoExistente.setAtualizadoEm(LocalDateTime.now());
        carrinhoRepository.save(carrinhoExistente);
    }
}
