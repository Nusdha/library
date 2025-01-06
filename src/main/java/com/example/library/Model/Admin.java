package com.example.library.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Set;

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
    private String password;

    @ReadOnlyProperty
    @DocumentReference
    @DBRef
    private Set<Book> book;

    public String getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getPassword() {
        return password;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
