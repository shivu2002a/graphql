package com.shiva.graphql.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.shiva.graphql.db.BookRepository;
import com.shiva.graphql.models.Book;

@Controller
public class BookController {
    
    private final BookRepository bookrepo;
 
    public BookController(BookRepository bookrepo) {
        this.bookrepo = bookrepo;
    }

    // @SchemaMapping(typeName = "Query", value = "allBooks") 
    @QueryMapping
    public List<Book> allBooks() {
        return bookrepo.findAll();
    }


    
}
