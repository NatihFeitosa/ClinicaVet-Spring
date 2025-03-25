package com.example.clinicavet.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String endereco;

    @OneToMany(mappedBy = "tutor")
    private List<Animal> animais;

    //getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String setEndereco(){
        return endereco;
    }

    public void getEndereco(){
        this.endereco = endereco;
    }

    public List<Animal> getAnimais(){
        return animais;
    }

    public void setAnimais(List<Animal> animais){
        this.animais = animais;
    }
}
