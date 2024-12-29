package com.example.library.Model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "borrow")
@Data
@Builder
public class Borrow {

    @Id
    @Generated
    private String borrowId;

    private Book book;
    private String bookID;
    private User user;
    private long userID;

    private LocalDate borrowDate;
    private LocalDate returnDate;

}
