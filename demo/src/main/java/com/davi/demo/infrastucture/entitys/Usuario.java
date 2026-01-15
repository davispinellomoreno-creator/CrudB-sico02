package com.davi.demo.infrastucture.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table ( name = "Cadastro Usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email" , unique = true)
    private String email;

    @Column(name = "idade")
    private int name;

}
