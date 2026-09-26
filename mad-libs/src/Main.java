import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Adjetivo: ");
        String adjective = scanner.nextLine();

        System.out.print("Animal: ");
        String animal = scanner.nextLine();

        System.out.print("Lugar: ");
        String place = scanner.nextLine();

        System.out.print("Verbo: ");
        String verb = scanner.nextLine();

        System.out.print("Comida: ");
        String food = scanner.nextLine();

        System.out.print("Objeto: ");
        String object = scanner.nextLine();

        System.out.print("Adjetivo: ");
        String secondAdjective = scanner.nextLine();

        System.out.println("");

        System.out.println("Certo dia, " + name + " acordou se sentindo muito " + adjective + ". Ao olhar pela janela, viu um enorme " + animal + " correndo em direção a " + place + ".\n" +
                        "Sem pensar duas vezes, " + name + " decidiu " + verb + " atrás dele, levando apenas uma " + food + " e um " + object + ".\n" +
                        "Quando finalmente alcançou o animal, ele disse: Você é muito " + secondAdjective + "!\n" +
                        "E então os dois viveram uma aventura que ninguém acreditaria.");

        scanner.close();
    }
}
