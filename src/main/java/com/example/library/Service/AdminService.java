package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Admin;

public interface AdminService {

    Admin saveAdmin(Admin admin);

    List<Admin> getAllAdmin();

    void deleteAdmin(String id);

    Admin getAdminById(String id);

    Admin updateAdmin(String id ,Admin admin);

    Admin getAdminByAdminEmail(String adminEmail);

}