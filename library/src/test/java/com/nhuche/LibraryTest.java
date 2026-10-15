package com.nhuche;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class LibraryTest {

    private Library library;
    private String isbn;

    @BeforeEach 
    void createLibraryAndAddBook() {
        library = new Library();
        library.addBook("BookTitle", "BookAuthor");

        // Pegando ISBN do livro
        isbn = library.getBooks()
                        .keySet()
                        .stream()
                        .findFirst()
                        .orElse(null);
    }

        /////////////////////
        /// BORROW METHOD ///
        /////////////////////

    @Test
    void borrowRegistersLoanForAvailableBook() {
        library.borrow(isbn);
        
        assertNotNull(library.getLoans()
                                .stream()
                                .map(Loan::getIsbn)
                                .filter(loan -> loan.equals(isbn))
                                .findFirst()
                                .orElse(null));
    }
    
    @Test
    void borrowThrowsBookNotFoundException() {
        String nonExistentIsbn = isbn + "a";

        assertThrows(BookNotFoundException.class, () -> {
            library.borrow(nonExistentIsbn);
        });
    }

    @Test
    void borrowThrowsAlreadyBorrowedException() {
        library.borrow(isbn);

        assertThrows(AlreadyBorrowedException.class, () -> {
            library.borrow(isbn);
        });
    }

        ///////////////////////
        /// GIVEBACK METHOD ///
        ///////////////////////
    
    @Test
    void giveBackReturnsAvailableLoan() {
        library.borrow(isbn);
        library.giveBack(isbn);

        assertNull(library.getLoans()
                            .stream()
                            .map(Loan::getIsbn)
                            .filter(loan -> loan.equals(isbn))
                            .findFirst()
                            .orElse(null));
    }

    @Test
    void giveBackThrowsBookNotFoundException() {
        library.borrow(isbn);

        String nonExistentIsbn = isbn + "a";

        assertThrows(BookNotFoundException.class, () -> {
            library.giveBack(nonExistentIsbn);
        });
    }

    @Test
    void giveBackThrowsItWasntBorrowedException() {
        assertThrows(ItWasntBorrowedException.class, () -> {
            library.giveBack(isbn);
        });
    }
}