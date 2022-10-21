package com.gft.desafiomvc.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "PARTICIPANTES")
public class Participante extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nome não pode ser vazio")
    @Column(nullable = false, unique = true)
    private String nome;

    @Email
    private String email;

    @NotEmpty(message = "Quatro letras não podem estar em branco")
    @Size(min = 4, max = 4, message = "Devem ser quatro letas")
    private String quatroLetras;

    @ManyToMany
    private List<Atividade> atividades;
}
