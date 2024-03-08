package com.develhope.swaggwer_controller.controller;

import com.develhope.swaggwer_controller.entity.Evento;
import com.develhope.swaggwer_controller.entity.User;
import com.develhope.swaggwer_controller.service.UserService;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User userToAdd){
        User userAdded = userService.addUser(userToAdd);
        return ResponseEntity.ok().body(userAdded);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<User> removeUser(@RequestBody User userToRemove){
        User userRemoved = userService.removeUser(userToRemove);
        return ResponseEntity.ok().body(userRemoved);
    }
    @PutMapping("/user/{idToUpdated}")
    public ResponseEntity<User> updateUser(@RequestBody User userToUpdated, @PathVariable Integer idToUpdated){
        User userUpdated = userService.updateUser(userToUpdated, idToUpdated);
        return ResponseEntity.ok().body(userUpdated);
    }
    @GetMapping("/listaUser")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUserView = userService.getAllUser();
        return ResponseEntity.ok().body(allUserView);
    }
    @GetMapping("/user/{idToView}")
    public ResponseEntity<User>  getUser(@PathVariable Integer idToView){
        User userView = userService.getUser(idToView);
        return ResponseEntity.ok().body(userView);
    }

}
