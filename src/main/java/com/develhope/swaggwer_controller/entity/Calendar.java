package com.develhope.swaggwer_controller.entity;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private Integer id;
    private String nome;
    private List<Evento> eventi;
    public Calendar() {}
    public Calendar(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.eventi = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Evento> getListaDiEvento() {
        return eventi;
    }

    public void setListaDiEvento(List<Evento> listaDiEvento) {
        this.eventi = listaDiEvento;
    }
}
