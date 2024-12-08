package com.desafio.tecnico.crud_carrinho_itens.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class ItemCarrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem; // Chave primaria

    @ManyToOne(fetch = FetchType.LAZY) // Muitos itens podem pertencer a um único carrinho
    @JoinColumn(name = "carrinhoId", nullable = false)
    private Carrinho carrinho;

    @ManyToOne(fetch = FetchType.LAZY) // Muitos itens podem estar associados a um único produto
    @JoinColumn(name = "produtoId", nullable = false)
    private Produto produto;

    @Column(nullable = false)
    @NotBlank(message = "quantidade de itens no carrinho não pode ser negativa.")
    private int quantidade;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(nullable = false)
    private LocalDateTime criadoEm;

    @Column(nullable = false)
    private LocalDateTime atualizadoEm;
}
