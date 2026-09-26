import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        String adjective;
        String animal;
        String place;
        String verb;
        String food;
        String object;
        String secondAdjective;

        System.out.println("");

        System.out.print("Nome: ");
        name = scanner.nextLine();

        System.out.print("Adjetivo: ");
        adjective = scanner.nextLine();

        System.out.print("Animal: ");
        animal = scanner.nextLine();

        System.out.print("Lugar: ");
        place = scanner.nextLine();

        System.out.print("Verbo: ");
        verb = scanner.nextLine();

        System.out.print("Comida: ");
        food = scanner.nextLine();

        System.out.print("Objeto: ");
        object = scanner.nextLine();

        System.out.print("Adjetivo: ");
        secondAdjective = scanner.nextLine();

        System.out.println("");

        System.out.println("Certo dia, " + name + " acordou se sentindo muito " + adjective + ". Ao olhar pela janela, viu um enorme " + animal + " correndo em direção a " + place + ".\n" +
                        "Sem pensar duas vezes, " + name + " decidiu " + verb + " atrás dele, levando apenas uma " + food + " e um " + object + ".\n" +
                        "Quando finalmente alcançou o animal, ele disse: Você é muito " + secondAdjective + "!\n" +
                        "E então os dois viveram uma aventura que ninguém acreditaria.");

        scanner.close();
    }
}
