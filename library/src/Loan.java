public class Loan {
    private String isbn;
    
    public Loan(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override 
    public String toString() {
        return isbn;
    }
}
