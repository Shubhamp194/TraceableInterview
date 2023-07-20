package com.example.tracableai.controller;

import com.example.tracableai.model.User;
import com.example.tracableai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
