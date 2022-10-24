package com.gft.desafiomvc.models;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "GRUPOS")
public class Grupo implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @Column(nullable = false, length = 10000)
    private int quantidadeDeParticipante;




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
