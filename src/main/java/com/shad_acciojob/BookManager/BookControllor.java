package com.shad_acciojob.BookManager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class BookControllor {
    Map<Integer, Book> bookdata= new HashMap<>();
    @PostMapping("/add-book")
    public String addbook(@RequestBody Book book){
        bookdata.put(book.getId(), book);
        return "Book added with id" + book.getId();
    }

}
