package com.desafio.tecnico.crud_carrinho_itens.service;

import com.desafio.tecnico.crud_carrinho_itens.model.Produto;
import com.desafio.tecnico.crud_carrinho_itens.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
}
