package com.example.library.Controller;

import com.example.library.Model.Admin;
import com.example.library.Service.AdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    public AdminController() {

    }

    //http://localhost:8081/api/admin/save(POST)
    @PostMapping
    public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin){
        return new ResponseEntity<>(adminService.saveAdmin(admin), HttpStatus.CREATED);
    }

    //http://localhost:8081/api/admin/getAllAdmin(GET)
    @GetMapping
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }

    @GetMapping("/{adminId}")
    public ResponseEntity<Admin> getAdminById(@PathVariable String adminId){
        return new ResponseEntity<>(adminService.getAdminById(adminId),HttpStatus.OK);
    }

    @PutMapping("/{adminId}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable String adminId, @RequestBody Admin admin){
       return new ResponseEntity<>(adminService.updateAdmin(adminId, admin),HttpStatus.OK);
    }

    @DeleteMapping("/{adminId}")
    public ResponseEntity<String> deleteAdmin(@PathVariable String adminId){
        adminService.deleteAdmin(adminId);
        return new ResponseEntity<>("Admin deleted successfully",HttpStatus.OK);
    }

    @GetMapping("/email/{adminEmail}")
     public ResponseEntity<Admin> getAdminByAdminEmail(@PathVariable String adminEmail) {
         Admin admin = adminService.getAdminByAdminEmail(adminEmail);
         if (admin == null) {
             return ResponseEntity.notFound().build();
         }
         return ResponseEntity.ok(admin);
     }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Admin admin) {
        return ResponseEntity.ok().build();
    }

}