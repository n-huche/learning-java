import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// ArrayList.contains retorna true se o elemento existir na lista, HashMap.containsKey retorna true se a key existir existir no map

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lista de pessoas

        List<Person> people = new ArrayList<>();

        // Lista de pessoas com idade

        HashMap<Person, Integer> peopleAge = new HashMap<>();

        int i = 0;

        int command;

        boolean condition = true;

        while (condition) {
            System.out.println("\nO que você quer fazer? \n\n" +
                                "1. Criar uma pessoa\n" +
                                "2. Adicionar idade pessoa\n" +
                                "3. Listar pessoas e idade\n" +
                                "4. Sair\n");
            System.out.print("Resposta: ");
            command = scanner.nextInt();
            scanner.nextLine();

            // Criar uma pessoa

            if (command == 1) {
                System.out.print("\nQual é o nome da pessoa que você quer criar? ");
                String name = scanner.nextLine();

                people.add(new Person(name));

                peopleAge.put(people.get(i), null);

                i++;
            }

            // Adicionar idade

            else if (command == 2) {
                System.out.print("\nVocê quer adicionar a idade de quem? ");
                String name = scanner.nextLine();
                Person personName = new Person(name);
                // Person personName = null;

                for (Person person : people) {
                    if (person.equals(personName)) {
                    // if (person.name.equals(name)) {
                        personName = person;
                    }
                }

                System.out.print("Quantos anos você quer que " + name + " tenha? ");
                int age = scanner.nextInt();

                peopleAge.replace(personName, age);
            }

            // Listar pessoas e idade

            else if (command == 3) {
                System.out.println();
                for (Person person : peopleAge.keySet()) {
                    System.out.println(person + " : " + peopleAge.get(person));
                }
            }

            // Sair

            else if (command == 4) {
                break;
            }

        }

        scanner.close();

    }
}