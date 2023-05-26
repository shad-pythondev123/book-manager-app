package com.shad_acciojob.BookManager;
import lombok.Setter;
import lombok.Getter;


@Setter
@Getter


public class Book {
    private Integer id;
    private Integer pages;
    private String name;

    private String author;

    public Book() {
    }

    public Book(Integer id, Integer pages, String name, String author) {
        this.id = id;
        this.pages = pages;
        this.name = name;
        this.author = author;
    }

}
