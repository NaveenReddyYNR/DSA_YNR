package Personal;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your First Input: ");
        int FirstNum = input.nextInt();

        System.out.println("Please enter your Second Input: ");
        int SecondNum = input.nextInt();

        System.out.println("Please enter your Operator like +, -, *, /, %: ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println(FirstNum + SecondNum);
        } else if (operator.equals("-")) {
            System.out.println(FirstNum - SecondNum);
        } else if (operator.equals("*")) {
            System.out.println(FirstNum * SecondNum);
        } else if (operator.equals("/")) {
            if (SecondNum == 0) {
                System.out.println("Error: Division by zero");
            } else {
                System.out.println((double) FirstNum / SecondNum);
            }
        } else if (operator.equals("%")) {
            System.out.println(FirstNum % SecondNum);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
