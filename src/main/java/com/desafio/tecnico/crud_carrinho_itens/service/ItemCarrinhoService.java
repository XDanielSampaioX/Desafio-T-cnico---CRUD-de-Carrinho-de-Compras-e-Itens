package com.desafio.tecnico.crud_carrinho_itens.service;

import com.desafio.tecnico.crud_carrinho_itens.model.Carrinho;
import com.desafio.tecnico.crud_carrinho_itens.model.ItemCarrinho;
import com.desafio.tecnico.crud_carrinho_itens.repository.ItemCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class ItemCarrinhoService{

    @Autowired
    private ItemCarrinhoRepository itemCarrinhoRepository;

    @Autowired
    private CarrinhoService carrinhoService;

    @Autowired
    private ProdutoService produtoService;

    public ItemCarrinho salvar(ItemCarrinho itemCarrinho) {
        return itemCarrinhoRepository.save(itemCarrinho);
    }

//    public ItemCarrinho atualizar(Long idCarrinho, Long idProduto, int quantidade) {
//        ItemCarrinho itemCarrinho = itemCarrinhoRepository.findByCarrinhoIdAndProdutoId(idCarrinho, idProduto)
//                .orElseThrow(() -> new RuntimeException("Item não encontrado no carrinho"));
//        itemCarrinho.setQuantidade(quantidade);
//        itemCarrinho.setAtualizadoEm(LocalDateTime.now());
//        return itemCarrinhoRepository.save(itemCarrinho);
//    }
//
//    public List<ItemCarrinho> listarTodosItens() {
//        return itemCarrinhoRepository.findAll();
//    }

//    public ItemCarrinho buscarItem(long id) {
//        return itemCarrinhoRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Item não encontrado"));
//    }
//
//    public void deletar(Long id) {
//        itemCarrinhoRepository.deleteById(id);
//    }
}
