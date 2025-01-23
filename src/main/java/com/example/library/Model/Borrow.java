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
    private long borrowId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public long getBorrowId() {
        return borrowId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBorrowId(long borrowId) {
        this.borrowId = borrowId;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    
}
