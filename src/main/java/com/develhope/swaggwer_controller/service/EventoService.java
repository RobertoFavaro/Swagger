package com.develhope.swaggwer_controller.service;

import com.develhope.swaggwer_controller.entity.Evento;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class EventoService {
    private List<Evento> listaDiEventi = new ArrayList<>();
    public Evento addEvento(Evento eventoDaAggiungere){
        listaDiEventi.add(eventoDaAggiungere);
        return eventoDaAggiungere;
    }
    public Evento deleteEvento(Evento EventoDaRimuovere){
        Evento eventoRimosso = new Evento();
        for(Evento evento : listaDiEventi){
            if(evento.getId().equals(EventoDaRimuovere.getId())){
                listaDiEventi.remove(evento);
                eventoRimosso = evento;
            }
        }
        return eventoRimosso;
    }
    public Evento updateEvento(Evento eventoDaAggiornare){
        Evento eventoAggiornato = new Evento();
        for(Evento evento : listaDiEventi){
            if(evento.getId().equals(eventoDaAggiornare.getId())){
                evento.setId(eventoDaAggiornare.getId());
                evento.setNome(eventoDaAggiornare.getNome());
                evento.setDataInizio(eventoDaAggiornare.getDataInizio());
                evento.setDataFine(eventoDaAggiornare.getDataFine());
                evento.setDescrizione(eventoDaAggiornare.getDescrizione());
                eventoAggiornato = evento;
            }
        }
        return eventoAggiornato;
    }
    public List<Evento> getAllEventi(){
        return listaDiEventi;
    }
}

