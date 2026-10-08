public class Loan {
    private String isbn;
    
    public Loan(String isbn) {
        this.isbn = isbn;
    }

    @Override 
    public String toString() {
        return isbn;
    }
}
