package com.desafio.tecnico.crud_carrinho_itens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CrudCarrinhoItensApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudCarrinhoItensApplication.class, args);
		System.out.println("Hello World");
		
		// Carrinho carrinho = new Carrinho();
		// Produto produto = new Produto(); // Necessario instanciar o produto para adicionar ao carrinho

		// produto.setIdProduto(1L);
		// produto.setNomeProduto("Caneta");
		// produto.setPrecoProduto(15.0);
		
		// carrinho.adicionarItem(produto, 2);
		// // carrinho.removerItem(1L);
		// System.out.println(carrinho.getItens());
	}

}
