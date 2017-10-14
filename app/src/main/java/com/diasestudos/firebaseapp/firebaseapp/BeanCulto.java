package com.diasestudos.firebaseapp.firebaseapp;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Dias on 14/10/2017.
 */

public class BeanCulto {

    private String igreja;
    private String data;
    private String obreiroLouvor;
    private String obreiroMensagem;
    private String obreiroPorta;
    private List<String> louvores;
    private String frequencia;

    public BeanCulto() {
    }

    public String getIgreja() {
        return igreja;
    }

    public void setIgreja(String igreja) {
        this.igreja = igreja;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObreiroLouvor() {
        return obreiroLouvor;
    }

    public void setObreiroLouvor(String obreiroLouvor) {
        this.obreiroLouvor = obreiroLouvor;
    }

    public String getObreiroMensagem() {
        return obreiroMensagem;
    }

    public void setObreiroMensagem(String obreiroMensagem) {
        this.obreiroMensagem = obreiroMensagem;
    }

    public String getObreiroPorta() {
        return obreiroPorta;
    }

    public void setObreiroPorta(String obreiroPorta) {
        this.obreiroPorta = obreiroPorta;
    }

    public List<String> getLouvores() {
        return louvores;
    }

    public void setLouvores(List<String> louvores) {
        this.louvores = louvores;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
}
