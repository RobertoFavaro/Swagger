package com.develhope.swaggwer_controller.service;

import com.develhope.swaggwer_controller.entity.Calendar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
@Service
public class CalendarService {
    private List<Calendar> listOfCalendar = new ArrayList<>();
    public Calendar addCalendar(Calendar calendarToAdd){
        listOfCalendar.add(calendarToAdd);
        return calendarToAdd;
    }
    private Calendar deleteCalendar(Calendar calendarToRemove){
        listOfCalendar.remove(calendarToRemove);
        return calendarToRemove;
    }
}
