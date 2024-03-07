package com.develhope.swaggwer_controller.entity;

import java.time.OffsetDateTime;

public class Evento {
    private Integer id;
    private String nome;
    private OffsetDateTime dataInizio;
    private OffsetDateTime dataFine;
    private String descrizione;
    public Evento() {}
    public Evento(Integer id, String nome, OffsetDateTime dataInizio, OffsetDateTime dataFine, String descrizione) {
        this.id = id;
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.descrizione = descrizione;
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

    public OffsetDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(OffsetDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public OffsetDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(OffsetDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
