package com.desafio.tecnico.crud_carrinho_itens.model;

import java.time.LocalDateTime;

import com.desafio.tecnico.crud_carrinho_itens.model.enums.Status;
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
    private Status status;

//    @Column(nullable = false)
    private LocalDateTime criadoEm;

//    @Column(nullable = false)
    private LocalDateTime atualizadoEm;
}
