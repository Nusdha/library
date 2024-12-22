package com.example.library.Controller;

import com.example.library.Model.Admin;
import com.example.library.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin){
        return new ResponseEntity<>(adminService.saveAdmin(admin), HttpStatus.CREATED);
    }

}