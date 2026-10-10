import java.util.Collections;

import java.util.Map;
import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;

public class Library {

    private static Map<String, Book> books = new HashMap<>();

    public static Map<String, Book> getBooks() {
        return Collections.unmodifiableMap(books);
    }

    public static Set<String> authors = new HashSet<>();

    public static Set<String> getAuthor() {
        return Collections.unmodifiableSet(authors);
    }

    public static void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.put(book.isbn, book);
        authors.add(author);
    }

    public static List<Loan> loans = new ArrayList<>();
    
    public static List<Loan> getLoans() {
        return loans;
    }

    public static void borrow(String isbn) {

        books.keySet().stream()
            .filter(book -> book.contains(isbn))
            .findFirst()
            .orElseThrow(() -> new BookNotFoundException("Esse ISBN é inválido."));

        loans.stream()
            .filter(loan -> loan.getIsbn().equals(isbn))
            .findFirst()
            .ifPresent(existingLoan -> {
                throw new AlreadyBorrowedException("Esse emprestimo já foi feito");
            });
        
        loans.add(new Loan(isbn));
    }

    public static void giveBack(String isbn) {
        if (!books.containsKey(isbn)) {
            throw new BookNotFoundException("Esse ISBN é inválido.");
        }
        Loan returnedLoan = loans.stream()
            .filter(loan -> loan.getIsbn().equals(isbn))
            .findFirst()
            .orElseThrow(() -> new ItWasntBorrowedException("Esse emprestimo não foi feito."));

        loans.remove(returnedLoan);
    }

    public static <T> T firstOrDeafult(List<T> list, T fallback) {
        if (list.isEmpty()) {
            return fallback;
        }
        return list.get(0);
    }
}
