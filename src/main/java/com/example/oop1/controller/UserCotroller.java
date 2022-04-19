package com.example.oop1.controller;

import com.example.oop1.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class UserCotroller {
    List<User> listUser= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @GetMapping("/users")
    public ResponseEntity<List<User>> getListUser(){
        for(int i=0;i<listUser.size();i++){
            System.out.println(listUser.toString());
        }
        return ResponseEntity.ok().body(listUser);
    }

    @PostMapping("/users/create")
    public ResponseEntity<User> create(){
        User user = new User();

        System.out.println("id: ");
       user.setId(sc.nextInt());
       sc.nextLine();
        System.out.println("name: ");
       user.setName(sc.nextLine());
        listUser.add(user);
        return ResponseEntity.ok().body(user);

    }

    @PutMapping("/users/update")
    public ResponseEntity<User> update(@RequestParam("id") int idx){
        User user = new User();
        for(int i=0;i<listUser.size();i++){
            if(listUser.get(i).getId()==(idx)){
                user=listUser.get(i);
            }
        }
        user.setName("");
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/user/delete")
    public ResponseEntity<?> delete(@RequestParam("id") int idx){

    }
}
