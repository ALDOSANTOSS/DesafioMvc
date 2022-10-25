package com.gft.desafiomvc.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity

public class Participante implements Serializable{

    private static final long serialVersionUID = 1L;

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


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Grupo> grupos;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "participantes")
    private List<Atividade> atividades;


    public Long getCodigo() {
        return id;
    }

    public void setCodigo(Long codigo) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuatroLetras() {
        return quatroLetras;
    }

    public void setQuatroLetras(String quatroLetras) {
        this.quatroLetras = quatroLetras;
    }


}
