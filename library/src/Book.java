import java.util.UUID;

public class Book {
    String isbn = UUID.randomUUID().toString();
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        Library.books.put(isbn, this);
        Library.authors.add(author);
    }

    @Override
    public String toString() {
        return title;
    }
}