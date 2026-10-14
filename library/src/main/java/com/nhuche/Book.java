package com.nhuche;

import java.util.UUID;

public class Book {
    private String isbn = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title;
    }
}
