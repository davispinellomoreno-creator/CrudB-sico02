package com.davi.demo.infrastucture.entitys;

import jakarta.persistence.*;
import lombok.*;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table ( name = "Cadastro_Usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ID;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email" , unique = true)
    private String email;

    @Column(name = "idade")
    private Integer idade;


}
