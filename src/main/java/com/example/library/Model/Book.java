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
}
