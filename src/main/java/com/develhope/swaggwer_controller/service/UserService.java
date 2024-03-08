package com.develhope.swaggwer_controller.service;

import com.develhope.swaggwer_controller.entity.Calendar;
import com.develhope.swaggwer_controller.entity.Evento;
import com.develhope.swaggwer_controller.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> listOfCalendar = new ArrayList<>();
    public User addUser(User userToAdd){
        listOfCalendar.add(userToAdd);
        return userToAdd;
    }
    public User removeUser(User userToRemove){
        listOfCalendar.remove(userToRemove);
        return userToRemove;
    }
    public User updateUser(User userToUpdate, Integer idToUpdate){
        User userUpdated = new User();
        for (User user : listOfCalendar) {
            if(user.getId().equals(idToUpdate)){
                user.setId(userToUpdate.getId());
                user.setNome(userToUpdate.getNome());
                user.setCognome(userToUpdate.getCognome());
                user.setEmail(userToUpdate.getEmail());
                user.setCalendari(userToUpdate.getCalendari());
                userUpdated = user;
            }
        }
        return userUpdated;
    }
    public List<User> getAllUser(){
        return listOfCalendar;
    }
    public User getUser(Integer idToView){
        User userView = new User();
        for(User user : listOfCalendar){
            if(user.getId().equals(idToView)){
                userView = user;
            }
        }
        return userView;
    }
}
