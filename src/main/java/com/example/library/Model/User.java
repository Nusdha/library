package com.example.library.Model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document (collection = "user")
@Data
@Builder
public class User {

    @Id
    private long userID;
    @NotBlank
    private String userFirstName;
    @NotBlank
    private String UserLastName;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String department;
    @NotBlank
    private String course;
    @NotBlank
    private int YearOfEnrollment;
    @NotBlank
    private String userPassword;

    @ReadOnlyProperty
    @DocumentReference
    @DBRef
    private Set<Borrow> borrow;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearOfEnrollment() {
        return YearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        YearOfEnrollment = yearOfEnrollment;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<Borrow> getBorrow() {
        return borrow;
    }

    public void setBorrow(Set<Borrow> borrow) {
        this.borrow = borrow;
    }
}
