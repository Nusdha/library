package com.example.library.Model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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
    private String userFirstName;
    private String UserLastName;
    private String email;
    private String department;
    private String course;
    private int YearOfEnrollment;

    @ReadOnlyProperty
    @DocumentReference
    @DBRef
    private Set<Borrow> borrow;

}
