package com.example.library.Controller;

import com.example.library.Model.Admin;
import com.example.library.Service.AdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
//(origins = "*")
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    public AdminController() {

    }

    //http://localhost:8081/api/admin/save(POST)
    @PostMapping("/save")
    public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin){
        return new ResponseEntity<>(adminService.saveAdmin(admin), HttpStatus.CREATED);
    }

    //@PostMapping("/login")
    //public ResponseEntity<Admin> loginAdmin(@PathVariable String adminEmail,@PathVariable String password){
        //return new ResponseEntity<>(adminService.loginAdmin(adminEmail,password), HttpStatus.CREATED);
    //}

    //http://localhost:8081/api/admin/getAllAdmin(GET)
    @GetMapping("/getAllAdmin")
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }

    @GetMapping("/getAdminById/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable String id){
        return new ResponseEntity<>(adminService.getAdminById(id),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable String id, @RequestBody Admin admin){
       return new ResponseEntity<>(adminService.updateAdmin(admin, id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAdmin(@PathVariable String id){
        adminService.deleteAdmin(id);
        return new ResponseEntity<>("Admin deleted successfully",HttpStatus.OK);
     }
}