import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        int command;

        // Lista de veículos

        List<Vehicle> veiculos = new ArrayList<>();

        // Programa

        while (running) {

            // Menu

            System.out.println("\nO que você quer fazer a seguir?\n\n" +
                                "1. Gerenciar veículos\n" +
                                "2. Andar com veículo\n" +
                                "3. Sair\n");
            System.out.print("Escolha: ");
            command = scanner.nextInt();

            // Gerenciador de veículos

            if(command == 1) {
                while (running) {
                    
                    System.out.println("\nO que você quer fazer a seguir?\n\n" +
                                "1. Listar veículos\n" +
                                "2. Adicionar veículo\n" +
                                "3. Remover veículo\n" +
                                "4. Fazer um truque os veículos\n" +
                                "5. Voltar\n");
                    System.out.print("Escolha: ");
                    command = scanner.nextInt();

                    // Listar veículos

                    if(command == 1) {
                        System.out.println();
                        int i = 1;
                        for(Vehicle veiculo : veiculos){
                            System.out.println(i + ". " + veiculo.model);
                            i++;
                        }
                    }

                    // Adicionar veículo

                    else if(command == 2) {
                        System.out.println("\nQue tipo de veículo você quer adicionar?\n\n" +
                                "1. Carro\n" +
                                "2. Moto\n" +
                                "3. Voltar\n");
                        System.out.print("Escolha: ");
                        command = scanner.nextInt();

                        String model = "";
                        int year;

                        if (command == 1) {
                            System.out.print("\nQual vai ser o modelo do seu carro? ");
                            scanner.nextLine();
                            model = scanner.nextLine();
                            
                            System.out.print("Qual é o ano do seu carro? ");
                            year = scanner.nextInt();

                            veiculos.add(new Car(model, year));
                        }

                        else if (command == 2) {
                            System.out.print("\nQual vai ser o modelo da sua moto? ");
                            scanner.nextLine();
                            model = scanner.nextLine();
                            
                            System.out.print("Qual é o ano da sua moto? ");
                            year = scanner.nextInt();

                            veiculos.add(new Motorcycle(model, year));
                        }

                        else if(command == 3) {
                            continue;
                        }

                        else {
                            System.out.println("\nOpção não disponível.");
                        }

                    }

                    // Remover veículo

                    else if (command == 3) {
                        System.out.println("\nDeseja prosseguir com a remoção de um veículo?\n\n" +
                                            "1. Sim\n" +
                                            "2. Não\n");
                        System.out.print("Escolha: ");
                        command = scanner.nextInt();
                        scanner.nextLine();

                        if (command == 1) {
                            System.out.print("\nQual é o nome do modelo do veículo você quer remover? ");
                            String model = scanner.nextLine();
                            
                            for(Vehicle veiculo : veiculos){
                                if(veiculo.model.equals(model)) {
                                    veiculos.remove(veiculo);
                                    break;
                                }
                            }
                        }

                        else if (command == 2) {
                            continue;
                        }

                        else {
                            System.out.println("\nOpção não disponível.");
                        }

                    }

                    // Fazer um truque

                    else if(command == 4) {
                        System.out.println();
                        for(Vehicle veiculo : veiculos) {
                            veiculo.trick();
                        }
                    }

                    // Voltar

                    else if(command == 5) {
                        break;
                    }

                    // Não disponível

                    else {
                        System.out.println("\nOpção não disponível.");
                    }

                }
            }

            // Controle de veículos

            else if(command == 2) {
                System.out.println("\nO que você quer fazer a seguir?\n\n" +
                                "1. Escolher veículo\n" +
                                "2. Voltar\n");
                System.out.print("Escolha o número: ");
                command = scanner.nextInt();

                // Escolher veículo

                if(command == 1) {
                    System.out.println();
                    int i = 1;
                    for(Vehicle veiculo : veiculos){
                        System.out.println(i + ". " + veiculo.model);
                        i++;
                    }
                    System.out.print("\nCom qual veículo você quer andar? (escolha pelo número): ");
                    command = scanner.nextInt();

                    Vehicle veiculo = veiculos.get(command - 1);

                    System.out.println("\nVocê escolheu um(a) " + veiculo.type + " chamado(a) " + veiculo.model + " vamos correr!");

                    // Dirigindo

                    while (running) {
                        System.out.println("\nPara onde você quer ir?\n\n" +
                                            "1. Frente\n" +
                                            "2. Trás\n" +
                                            "3. Direita\n" +
                                            "4. Esquerda\n" +
                                            "5. Parar\n");
                        System.out.print("Escolha o número: ");
                        command = scanner.nextInt();

                        // Para frente

                        if(command == 1) {
                            System.out.print("Quantos metros você quer ir para frente? (apenas o número): ");
                            command = scanner.nextInt();
                            veiculo.forward(command);
                        }

                        // Para trás

                        else if(command == 2) {
                            System.out.print("Quantos metros você quer ir para trás? (apenas o número): ");
                            command = scanner.nextInt();
                            veiculo.backward(command);
                        }

                        // Para direita

                        else if(command == 3) {
                            System.out.print("Quantos metros você quer ir para direita? (apenas o número): ");
                            command = scanner.nextInt();
                            veiculo.right(command);
                        }

                        // Para esquerda

                        else if(command == 4) {
                            System.out.print("Quantos metros você quer ir para esquerda? (apenas o número): ");
                            command = scanner.nextInt();
                            veiculo.left(command);
                        }

                        // Total corrido

                        else if(command == 5) {
                            System.out.println("\nO que você quer fazer a seguir?\n\n" +
                                                "1. Ver o quanto corri\n" +
                                                "2. Sair\n");
                            System.out.print("Escolha o número: ");
                            command = scanner.nextInt();

                            if(command == 1) {
                                System.out.println(veiculo.totalMoved());
                            }

                            else if(command == 2) {
                                break;
                            }

                            else {
                                System.out.println("\nOpção não disponível.");
                            }
                        }

                        else {
                            System.out.println("\nOpção não disponível.");
                        }

                    }

                }

                // Voltar

                else if(command == 2) {
                    continue;
                }

                // Não disponível

                else {
                    System.out.println("\nOpção não disponível.");
                }
            }

            // Encerrar programa

            else if(command == 3) {
                break;
            }

            // Não disponível

            else {
                System.out.println("\nOpção não disponível.");
            }

        }

        scanner.close();

    }
}
