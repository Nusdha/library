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

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Document(collection = "book")
@Data
@Builder
public class Book {

    @Id
    private String bookID;
    private String bookTittle;
    private int ISBN;
    private LocalDate publicationDate;
    private String subject;
    private int status;

    @DocumentReference(lazy = true)
    private Admin admin;
    @DocumentReference(lazy = true)
    private User user;

    @ReadOnlyProperty
    @DocumentReference
    @DBRef
    private Set<Borrow> borrow;

    private  String adminId;
    private  long userID;

    public String getBookID() {
        return bookID;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public int getISBN() {
        return ISBN;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public String getSubject() {
        return subject;
    }

    public int getStatus() {
        return status;
    }

    public Admin getAdmin() {
        return admin;
    }

    public User getUser() {
        return user;
    }

    public Set<Borrow> getBorrow() {
        return borrow;
    }

    public String getAdminId() {
        return adminId;
    }

    public long getUserID() {
        return userID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBorrow(Set<Borrow> borrow) {
        this.borrow = borrow;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
