package com.nhuche;

public class AlreadyBorrowedException extends RuntimeException {
    public AlreadyBorrowedException(String string) {
        super(string);
    }
}
