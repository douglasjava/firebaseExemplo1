package com.diasestudos.firebaseapp.firebaseapp;

/**
 * Created by Dias on 14/10/2017.
 */

public class BeanUsuarios {

    private String nome;
    private String sobreNome;
    private String sexo;
    private Integer idade;

    public BeanUsuarios() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
