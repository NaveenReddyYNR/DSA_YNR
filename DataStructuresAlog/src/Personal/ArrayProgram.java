package Personal;

public class ArrayProgram {
    public static void main(String[] args) {
        String[] cars = {"BMW", "BENZ", "KIA", "TATA"};
        for (int car = 0; car < cars.length; car++) {
            if (cars[car].equals("BMW")) {
                System.out.println("This is BMW car: " + cars[car]);
            } else {
                System.out.println("I don't know this Car Brand: " + cars[car]);
            }
        }
    }
}
