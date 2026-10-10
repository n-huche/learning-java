import java.util.UUID;

public class Book {
    String isbn = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title;
    }
}