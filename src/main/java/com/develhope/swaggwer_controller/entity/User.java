package com.develhope.swaggwer_controller.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer id;
    private String nome;
    private String cognome;
    private String email;
    private List<Calendar> calendari;
    public User() {}

    public User(String nome, String cognome, String email, Integer id) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.calendari = new ArrayList<>();
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Calendar> getCalendari() {
        return calendari;
    }

    public void setCalendari(List<Calendar> calendari) {
        this.calendari = calendari;
    }
}
