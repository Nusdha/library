package com.example.library.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document (collection = "admin")
@Data
@Builder
public class Admin {
    @Id
    private String adminId;
    private String adminName;
    private String adminEmail;


    public Admin(String adminId, String adminName, String adminEmail) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
    }


    public Admin() {
    }

    

    public Admin(String adminName, String adminEmail) {
        this.adminName = adminName;
        this.adminEmail = adminEmail;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
