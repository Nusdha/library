package com.example.library.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

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

}
