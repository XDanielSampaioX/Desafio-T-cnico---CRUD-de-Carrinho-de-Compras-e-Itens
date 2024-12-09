package com.desafio.tecnico.crud_carrinho_itens.dto;

import com.desafio.tecnico.crud_carrinho_itens.model.enums.StatusCarrinho;


import java.time.LocalDateTime;

public class CarrinhoDTO {

        private Long id; //chave primaria

        private String clienteNome;

        private StatusCarrinho status;

        private LocalDateTime criadoEm;

        private LocalDateTime atualizadoEm;
}
