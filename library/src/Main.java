import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int command;
        boolean codition = true;
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

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
                Escolha:""");
                System.out.print(" ");
                command = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println();

                // Adicionar Livro

                if (command == 1) {
                    System.out.print("\nQual é o nome do livro que você quer adicionar? ");
                    String title = scanner.nextLine();

                    System.out.print("Qual é o nome do autor desse livro? ");
                    String author = scanner.nextLine();

                    library.addBook(title, author);
                }

                // Ver lista de livros

                else if (command == 2) {
                    System.out.println(library.getBooks());
                }

                // Pedir livro emprestado

                else if (command == 3) {
                    System.out.print("Insira o ISBN do livro que você quer pegar emprestado: ");
                    String isbn = scanner.nextLine();
                    System.out.println();

                    try {
                        library.borrow(isbn);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }  
                }

                // Ver o que deve

                else if (command == 4) {
                    System.out.println(library.firstOrDeafult(library.getLoans(), new Loan("Você não deve nada")));
                }

                // Devolver livro

                else if (command == 5) {
                    System.out.print("Insira o ISBN do livro que você quer devolver: ");
                    String isbn = scanner.nextLine();
                    System.out.println();

                    try {
                        library.giveBack(isbn);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                // Ver authores

                else if (command == 6) {
                    System.out.println(library.getAuthors());
                }

                // Sair

                else if (command == 7) {
                    break;
                }

                // Erro

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
