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
    public Admin updateAdmin(String adminId ,Admin admin) {
        Admin existingAdmin = getAdminById(adminId);
                existingAdmin.setAdminName(admin.getAdminName());
                existingAdmin.setAdminEmail(admin.getAdminEmail());
                existingAdmin.setPassword(admin.getPassword());
                return adminRepository.save(existingAdmin);
    }

    @Override
    public void deleteAdmin(String adminId) {
        adminRepository.deleteById(adminId);
    }

    @Override
    public Admin getAdminById(String adminId) {
        Optional<Admin> admin =adminRepository.findById(adminId);
        return admin.orElseThrow(() -> new RuntimeException("Admins not found"));
    }

    @Override
    public Admin getAdminByAdminEmail(String adminEmail) {
        return adminRepository.findByAdminEmail(adminEmail);
    }
        

}