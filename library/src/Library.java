import java.util.Map;
import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;


public class Library {
    public static Map<String, Book> books = new HashMap<>();
    public static Set<String> authors = new HashSet<>();
    public static List<Loan> loan = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void borrow() {
        System.out.println(books);
        System.out.println("Que livro você quer emprestado (ISBN)?");
        String isbn = scanner.nextLine();

        if (!books.containsKey(isbn)) {
            throw new BookNotFoundException("Esse ISBN é inválido.");
        }

        for (Loan book : loan) {
            if (book.toString().equals(isbn)) {
                throw new IllegalStateException("Esse livro já foi emprestado.");
            }
        }

        loan.add(new Loan(isbn));
    }

    public static <T> T firstOrDeafult(List<T> list, T fallback) {
        if (list.isEmpty()) {
            return fallback;
        }
        return list.get(0);
    }
}
