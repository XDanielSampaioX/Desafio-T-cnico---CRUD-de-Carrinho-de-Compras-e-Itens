package com.desafio.tecnico.crud_carrinho_itens.model;

import java.time.LocalDateTime;

import com.desafio.tecnico.crud_carrinho_itens.model.enums.StatusCarrinho;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //chave primaria

//    @Column(nullable = false, length = 100)
    private String clienteNome;

    @Enumerated(EnumType.STRING)
//    @Column(nullable = false, length = 20)
    private StatusCarrinho status = StatusCarrinho.ATIVO;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime criadoEm = LocalDateTime.now();

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime atualizadoEm;
}
