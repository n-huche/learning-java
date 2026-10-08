import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int command;

        boolean codition = true;

        // Programa

        while (codition) {
            
            // Menu

            try {
                System.out.print("""
                \nO que você quer fazer?\n
                    1. Adicionar livro
                    2. Ver lista de livros
                    3. Pedir livro emprestado
                    4. Ver o que deve
                    5. Devolver livro
                    6. Listar autores
                    7. Sair\n
                Escolha:
                """);
                command = scanner.nextInt();
                scanner.nextLine();

                // Adicionar Livro

                if (command == 1) {
                    System.out.print("\nQual é o nome do livro que você quer adicionar? ");
                    String title = scanner.nextLine();

                    System.out.print("Qual é o nome do autor desse livro? ");
                    String author = scanner.nextLine();

                    new Book(title, author);
                }

                // Ver lista de livros

                else if (command == 2) {
                    System.out.println(Library.books);
                }

                // Pedir livro emprestado

                else if (command == 3) {
                    try {
                        Library.borrow();
                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                }

                // Ver o que deve

                else if (command == 4) {
                    System.out.println("\n" + Library.firstOrDeafult(Library.loan, new Loan("Você não deve nada")));
                }

                // Devolver livro

                else if (command == 5) {
                    System.out.println("\n" + Library.books);
                    System.out.print("\nQue livro você quer devolver (ISBN)?");
                    String isbn = scanner.nextLine();
                    Library.books.remove(isbn);
                }

                else if (command == 6) {
                    System.out.println("\n" + Library.authors);
                }

                else if (command == 7) {
                    break;
                }

                else {
                    throw new Exception();
                }

            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.print("\nOcorreu um erro.\n");
            } catch (Exception e) {
                System.out.print("\nOcorreu um erro.\n");
            }
        }
        scanner.close();
    }
}
