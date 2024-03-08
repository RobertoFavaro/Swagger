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
    public Calendar deleteCalendar(Calendar calendarToRemove){
        listOfCalendar.remove(calendarToRemove);
        return calendarToRemove;
    }
    public Calendar updateCalendar(Calendar calendarToUpdate, Integer idToUpdate){
        Calendar calendarUpdated = new Calendar();
        for (Calendar calendar : listOfCalendar){
            if(calendar.getId().equals(idToUpdate)){
                calendar.setId(calendarToUpdate.getId());
                calendar.setNome(calendarToUpdate.getNome());
                calendar.setListaDiEvento(calendarToUpdate.getListaDiEvento());
                calendarUpdated = calendar;
            }
        }
        return calendarUpdated;
    }
    public List<Calendar> getAllCalendar(){
        return listOfCalendar;
    }
    public Calendar getCalendar(Integer idToView){
        Calendar calendarView = new Calendar();
        for (Calendar calendar : listOfCalendar){
            if(calendar.getId().equals(idToView)){
                calendarView = calendar;
            }
        }
        return calendarView;
    }
}
