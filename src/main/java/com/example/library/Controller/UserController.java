package com.example.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Model.User;
import com.example.library.Service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {

    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{userID}")
    public ResponseEntity<User> getUserById(@PathVariable String userID){
        return new ResponseEntity<>(userService.getUserById(userID),HttpStatus.OK);
    }

    @PutMapping("/{userID}")
    public ResponseEntity<User> updateUser(@PathVariable String userID, @RequestBody User user){
       return new ResponseEntity<>(userService.updateUser(userID, user),HttpStatus.OK);
    }

    @DeleteMapping("/{userID}")
    public ResponseEntity<String> deleteUser(@PathVariable String userID){
        userService.deleteUser(userID);
        return new ResponseEntity<>("User deleted successfully",HttpStatus.OK);
     }

     @GetMapping("/email/{email}")
     public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
         User user = userService.getUserByEmail(email);
         if (user == null) {
             return ResponseEntity.notFound().build();
         }
         return ResponseEntity.ok(user);
     }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        return ResponseEntity.ok().build();
    }
}