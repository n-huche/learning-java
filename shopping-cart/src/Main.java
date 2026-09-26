import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;

        System.out.println();

        System.out.print("O que você gostaria de comprar? ");
        item = scanner.nextLine();

        System.out.print("Quanto custa cada unidade? ");
        price = scanner.nextDouble();

        System.out.print("Quantas você gostaria de comprar? ");
        quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println();

        System.out.println("Você comprou " + quantity + " " + item + "/s");
        System.out.println("Sua conta deu R$" + total);

        scanner.close();
    };
}
