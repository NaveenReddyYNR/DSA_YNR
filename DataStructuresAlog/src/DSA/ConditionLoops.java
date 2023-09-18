package DSA;

import java.util.Scanner;

public class ConditionLoops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary :");
        int salary = input.nextInt();

        if (salary >= 25000) {
            salary = salary + 10000;
        } else {
            salary = salary + 50000;
        }

        System.out.println("your total salary + bonus is = " + salary);
    }
}
