package com.gft.desafiomvc.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;


    @NotEmpty(message = "Nome não pode ser vazio")
    @Column(nullable = false, unique = true)
    private String nome;
    @Email
    private String email;

    @NotEmpty(message = "Quatro letras não podem estar em branco")
    @Size(min = 4, max = 4, message = "Devem ser quatro letas")
    private String quatroLetras;

    private String senha;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
