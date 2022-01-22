package com.rafael.bookstoremanager2.controller;

import com.rafael.bookstoremanager2.dto.MessageResponseDTO;
import com.rafael.bookstoremanager2.entity.Book;
import com.rafael.bookstoremanager2.repository.BookRepository;
import com.rafael.bookstoremanager2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }
}
