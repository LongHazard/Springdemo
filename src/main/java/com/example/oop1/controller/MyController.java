package com.example.oop1.controller;

import com.example.oop1.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping(value = {"/hello-world", "/hello"}, method = RequestMethod.GET)
    public ResponseEntity<?> helloWorld(){
        User user = new User(1, "Nguyen Van Long");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
    }
}
