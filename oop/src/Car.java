public class Car extends Vehicle {

    public Car(String model, int year) {
        super("carro", model, year);
    }

    public void trick() {
        System.out.println("O " + model + " fez um drift!!");
    }

}