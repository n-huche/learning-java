import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Optional;

public class Library {

            //////////////
            /// LIVROS ///
            //////////////
  
    // Adicionar novo livro
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.put(book.getIsbn(), book);
        authors.add(author);
    }
    
    // ISBNs e Livros referentes
    private Map<String, Book> books = new HashMap<>();

    // Ver livros existentes e seus ISBNs
    public Map<String, Book> getBooks() {
        return Collections.unmodifiableMap(books);
    }

            ///////////////
            /// AUTORES ///
            ///////////////

    // Set dos autores
    private Set<String> authors = new HashSet<>();

    // Ver autores existentes
    public Set<String> getAuthors() {
        return Collections.unmodifiableSet(authors);
    }

    // Ver livros de um autor
    public String getAuthorsBooks(String author) {
        authorValidation(author)
            .orElseThrow(
                () -> new NonExistentAuthorException(author)
            );
        return author;
    }
    
            ///////////////////
            /// EMPRESTIMOS ///
            ///////////////////

    // Lista de emprestimos
    List<Loan> loans = new ArrayList<>();
    
    // Ver emprestimos feitos
    public List<Loan> getLoans() {
        return loans;
    }

    // Ver último emprestimo feito
    public <T> T firstOrDeafult(List<T> list, T fallback) {
        if (list.isEmpty()) {
            return fallback;
        }
        return list.get(0);
    }

    // Pedir livro emprestado
    public void borrow(String isbn) {
        isbnValidation(isbn)
            .orElseThrow(
                () -> new BookNotFoundException("Esse ISBN é invalido.")
            );

        loanValidation(isbn)
            .ifPresent(
                loan -> {throw new AlreadyBorrowedException("Esse livro já foi emprestado");}
            );

        loans.add(new Loan(isbn));
    }

    // Devolver livro
    public void giveBack(String isbn) {
        if (!books.containsKey(isbn)) {
            throw new BookNotFoundException("Esse ISBN é inválido.");
        }
        Loan returnedLoan = loans.stream()
            .filter(loan -> loan.getIsbn().equals(isbn))
            .findFirst()
            .orElseThrow(() -> new ItWasntBorrowedException("Esse emprestimo não foi feito."));

        loans.remove(returnedLoan);
    }

            /////////////////
            /// CHECAGENS ///
            /////////////////
            
    // Verificar se um autor existe
    private Optional<String> authorValidation(String author) {
        return authors.stream()
                    .filter(oneAuthor -> oneAuthor.equals(author))
                    .findFirst();
    }

    // Verificar se ISBN existe
    private Optional<Book> isbnValidation(String isbn) {
        return Optional.ofNullable(books.get(isbn));
    }

    // Verificar se Loan existe
    private Optional<Loan> loanValidation(String isbn) {
        return loans.stream()
                    .filter(loan -> loan.getIsbn().equals(isbn))
                    .findFirst();
    }

}