package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Admin;

public interface AdminService {

    Admin saveAdmin(Admin admin);

    List<Admin> getAllAdmin();

    void deleteAdmin(long id);

    Admin getAdminById(long id);

    Admin updateAdmin(Admin admin, long id);

    //Admin loginAdmin(String adminEmail, String password);

}