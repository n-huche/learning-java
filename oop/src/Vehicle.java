abstract public class Vehicle implements Locomotion {

    public String type = "";
    public String model = "";
    public int year;

    Vehicle(String type, String model, int year) {
        this.type = type;
        this.model = model;
        this.year = year;
    }

    abstract public void trick();

    private String direction = "";
    private int movedHorizontally;
    private int movedVertically;

    private void message(int distance) {
        System.out.println(model + " foi " + distance + "m para " + direction);
    }

    public int forward(int distance) {
        direction = "frente";
        movedVertically += distance;
        message(distance);
        return movedVertically;
    }

    public int backward(int distance) {
        direction = "trás";
        movedVertically -= distance;
        message(distance);
        return movedVertically;
    }

    public int right(int distance) {
        direction = "direita";
        movedHorizontally += distance;
        message(distance);
        return movedHorizontally;
    }

    public int left(int distance) {
        direction = "esquerda";
        movedHorizontally -= distance;
        message(distance);
        return movedHorizontally;
    }

    public String totalMoved() {

        String verticalDirection = "";
        String horizontalDirection = "";

        if (movedVertically > 0) {
            verticalDirection = "para frente";
        }

        else if (movedVertically < 0) {
            verticalDirection = "para trás";
        }

        if (movedHorizontally > 0) {
            horizontalDirection = "para direita";
        }

        else if (movedHorizontally < 0) {
            horizontalDirection = "para esquerda";
        }

        String totalMoved = Math.abs(movedVertically) + "m " + verticalDirection + "\n" + Math.abs(movedHorizontally) + "m " + horizontalDirection; 

        return totalMoved;

    }

}