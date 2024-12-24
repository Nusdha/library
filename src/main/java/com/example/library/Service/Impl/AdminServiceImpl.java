package com.example.library.Service.Impl;

import com.example.library.Model.Admin;
import com.example.library.Repository.AdminRepository;
import com.example.library.Service.AdminService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Admin updateAdmin(Admin admin, String id) {
        Admin existingAdmin = getAdminById(id);
                existingAdmin.setAdminName(admin.getAdminName());
                existingAdmin.setAdminEmail(admin.getAdminEmail());
                return adminRepository.save(existingAdmin);
            }


    @Override
    public void deleteAdmin(String id) {
        adminRepository.deleteById(id);
    }

    @Override
    public Admin getAdminById(String id) {
        Optional<Admin> admin =adminRepository.findById(id);
        return admin.orElseThrow(() -> new RuntimeException("Student not found"));
    }
        

}