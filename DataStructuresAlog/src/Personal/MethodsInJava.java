package Personal;

public class MethodsInJava {
    public static void multiplication(double a, double b) {
        double result = a * b;
        System.out.println("The result of " + a + " * " + b + " is: " + result);
//        return result;
    }

    public static void main(String[] args) {
        multiplication(2.5, 3.5);
//        multiplication(5, 3);
//        multiplication(7, 3);
//        multiplication(10, 3);
    }
}
