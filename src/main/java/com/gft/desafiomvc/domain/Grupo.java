package com.gft.desafiomvc.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "GRUPOS")
public class Grupo extends AbstractEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @Column(nullable = false, length = 10000)
    private int quantidadeDeParticipante;

    @OneToMany
    private List<Participante> participantes;


}
