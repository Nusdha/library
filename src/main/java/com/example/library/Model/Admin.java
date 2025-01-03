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

    @ReadOnlyProperty
    @DocumentReference
    @DBRef
    private Set<Book> book;

}
