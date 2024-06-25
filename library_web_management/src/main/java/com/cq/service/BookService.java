package com.cq.service;

import com.cq.pojo.Book;

public interface BookService {
    void select(Integer id);

    void addBook(Book book);

    void delete(Integer id);

    void update(Book book);
}
