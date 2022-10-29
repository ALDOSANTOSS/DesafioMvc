package com.gft.desafiomvc.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity

public class Grupo implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @Column(nullable = false, length = 10000)
    private int quantidadeDeParticipante;


    @ManyToOne(cascade = CascadeType.ALL)
    private Evento eventos;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "grupos")
    private List<Participante> participantes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEventos() {
        return eventos;
    }

    public void setEventos(Evento eventos) {
        this.eventos = eventos;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeParticipante() {
        return quantidadeDeParticipante;
    }

    public void setQuantidadeDeParticipante(int quantidadeDeParticipante) {
        this.quantidadeDeParticipante = quantidadeDeParticipante;
    }



}
