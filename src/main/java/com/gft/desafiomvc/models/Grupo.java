package com.gft.desafiomvc.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity

public class Grupo implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @Column(nullable = false, length = 10000)
    private int quantidadeDeParticipante;


    @ManyToOne(cascade = CascadeType.ALL)
    private Evento eventos;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "grupos")
    private List<Participante> participantes;




    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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
