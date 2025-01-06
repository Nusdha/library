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
@CrossOrigin
//(origins = "*")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {

    }

    //http://localhost:8081/api/user/save(POST)
    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    //@PostMapping("/login")
    //public ResponseEntity<User> loginUser(@PathVariable String email,@PathVariable String userPassword){
       // return new ResponseEntity<>(userService.loginUser(email,userPassword), HttpStatus.CREATED);
    //}

    //http://localhost:8081/api/user/getAllUser(GET)
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
       return new ResponseEntity<>(userService.updateUser(user, id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfully",HttpStatus.OK);
     }

}
