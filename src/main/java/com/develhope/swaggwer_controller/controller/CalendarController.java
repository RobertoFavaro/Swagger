package com.develhope.swaggwer_controller.controller;

import com.develhope.swaggwer_controller.entity.Calendar;
import com.develhope.swaggwer_controller.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
