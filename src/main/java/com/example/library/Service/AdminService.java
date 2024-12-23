package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Admin;

public interface AdminService {

    Admin saveAdmin(Admin admin);

    List<Admin> getAllAdmin();

    Admin updateAdmin(Admin admin, String id);

    Admin getAdminById(String id);



    
}