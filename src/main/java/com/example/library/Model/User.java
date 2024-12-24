package com.example.library.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private int YearOfEntrollment;

}
