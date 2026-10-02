public class Motorcycle extends Vehicle{

    public Motorcycle(String model, int year) {
        super("moto", model, year);
    }

    public void trick() {
        System.out.println("A " + model + " empinou!!");
    }

}
