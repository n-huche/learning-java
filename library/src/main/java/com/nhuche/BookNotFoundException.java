package com.nhuche;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String string) {
        super(string);
    }
}
