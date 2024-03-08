package com.develhope.swaggwer_controller.controller;

import com.develhope.swaggwer_controller.entity.Evento;
import com.develhope.swaggwer_controller.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventoController {
    @Autowired
    private EventoService eventoService;
    @PostMapping("/add")
    public ResponseEntity<Evento> aggiungiEvento(@RequestBody Evento eventoDaAggiungere) {
        Evento eventoAggiunto = eventoService.addEvento(eventoDaAggiungere);
        return ResponseEntity.ok().body(eventoAggiunto);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Evento> rimuoviEvento(@RequestBody Evento EventoDaRimuovere){
        Evento eventoRimosso = eventoService.deleteEvento(EventoDaRimuovere);
        return ResponseEntity.ok().body(eventoRimosso);
    }
    @PutMapping("/update/{idDaAggiornare}")
    public ResponseEntity<Evento> updateEvento(@RequestBody Evento eventoDaAggiornare, @PathVariable Integer idDaAggiornare){
        Evento eventoAggiornato = eventoService.updateEvento(eventoDaAggiornare, idDaAggiornare);
        return ResponseEntity.ok().body(eventoAggiornato);
    }
    @GetMapping("/listaEventi")
    public ResponseEntity<List<Evento>> getListEventi(){
        List<Evento> eventiPresi = eventoService.getAllEventi();
        return ResponseEntity.ok().body(eventiPresi);
    }
    @GetMapping("/evento/{idDaVisualizzare}")
    public ResponseEntity<Evento> getEvento(@PathVariable Integer idDaVisualizzare){
        Evento eventoVisualizzato = eventoService.visualizzaEvento(idDaVisualizzare);
        return ResponseEntity.ok().body(eventoVisualizzato);
    }
}