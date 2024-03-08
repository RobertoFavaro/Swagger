package com.develhope.swaggwer_controller.controller;

import com.develhope.swaggwer_controller.entity.Calendar;
import com.develhope.swaggwer_controller.entity.Evento;
import com.develhope.swaggwer_controller.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    @Autowired
    CalendarService calendarService;
    @PostMapping("/add")
    public ResponseEntity<Calendar> addCalendar(@RequestBody Calendar calendarToAdd){
        Calendar calendarAdded = calendarService.addCalendar(calendarToAdd);
        return ResponseEntity.ok().body(calendarAdded);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Calendar> removeCalendar(@RequestBody Calendar calendarToRemove){
        Calendar calendarRemoved = calendarService.deleteCalendar(calendarToRemove);
        return ResponseEntity.ok().body(calendarRemoved);
    }
    @PutMapping("/update/{idToUpdate}")
    public ResponseEntity<Calendar> updateCalendar(@RequestBody Calendar calendarToUpdate, @PathVariable Integer idToUpdate){
        Calendar calendarUpdated = calendarService.updateCalendar(calendarToUpdate, idToUpdate);
        return ResponseEntity.ok().body(calendarUpdated);
    }
    @GetMapping("/allCalendar")
    public ResponseEntity<List<Calendar>> getAllCalendar(){
        List<Calendar> calendarTaken = calendarService.getAllCalendar();
        return ResponseEntity.ok().body(calendarTaken);
    }
    @GetMapping("/calendar/{idToView}")
    public ResponseEntity<Calendar> getCalendar(@RequestBody Integer idToView){
        Calendar calendarViewed = calendarService.getCalendar(idToView);
        return ResponseEntity.ok().body(calendarViewed);
    }
}
