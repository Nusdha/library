package com.example.library.Service;

import java.util.List;

import com.example.library.Model.Admin;

public interface AdminService {

    Admin saveAdmin(Admin admin);

    List<Admin> getAllAdmin();

    void deleteAdmin(String adminId);

    Admin getAdminById(String adminId);

    Admin updateAdmin(String adminId ,Admin admin);

    Admin getAdminByAdminEmail(String adminEmail);

}