package com.example.bookStore.controller;

import com.example.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("api/v1/books")
    public ResponseEntity<List<Object>> getBooks(){
        BookDto book = BookDto.builder().title("First Book").build();
        BookDto secondBook = BookDto.builder().title("Second Book").build();

        List<Object> books = new ArrayList<>();
        books.add(secondBook);
        books.add(book);

        return ResponseEntity.ok(books);
    }
}
