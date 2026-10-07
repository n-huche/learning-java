import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int command;

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;

        // Programa

        while (condition) {

            // Menu

            System.out.println("\nO que você quer fazer?\n\n" +
                    "1. FizzBuzz\n" +
                    "2. Filtrar Array\n" +
                    "3. Inverter String\n" + 
                    "4. Contar Vogais\n" +
                    "5. Verificar Palíndromo\n" +
                    "6. Sair\n");
            System.out.print("Resposta: "); 
            command = scanner.nextInt();
            scanner.nextLine();

            // FrizzBuzz

            if (command == 1) {
                System.out.print("\nAté que número você quer que o FizzBuzz vá? ");
                int until = scanner.nextInt();
                System.out.println("\n" + FizzBuzz.fizzbuzz(until));
            }

            // Ordernar Array

            else if (command == 2) {
                System.out.print("\nEscolha seus números (n, n, ...):  ");
                String numbers = scanner.nextLine();
                System.out.println("\nMenor e maior números: " + ArrayElements.arrayElements(numbers.split(", ")));
            }

            // Inverter String

            else if (command == 3) {
                System.out.print("\nEscreva a palavra que você quer inverter:  ");
                String string = scanner.nextLine();
                System.out.println("\nSua palavra invertida: " + ReverseString.reverseString(string));
            }

            // Contar Vogais

            else if (command == 4) {
                System.out.print("\nEscreva palavra que você quer contar as vogais:  ");
                String string = scanner.nextLine();
                System.out.println("\nQuantidades de vogais: " + VowelCounter.vowelCounter(string));
            }

            // Verificar Palíndromo

            else if (command == 5) {
                System.out.print("\nEscreva palavra que você quer verificar se é um palídromo:  ");
                String string = scanner.nextLine();
                System.out.println("\nResultado: " + PalindromeChecker.palindromeChecker(string));
            }

            // Sair

            else if (command == 6) {
                break;
            }
        }

        

        scanner.close();
    }
}
