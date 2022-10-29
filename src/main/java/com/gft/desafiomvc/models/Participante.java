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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
}
