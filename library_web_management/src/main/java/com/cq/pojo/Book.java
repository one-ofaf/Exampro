package com.cq.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer bookId;
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
    private String status;

}
