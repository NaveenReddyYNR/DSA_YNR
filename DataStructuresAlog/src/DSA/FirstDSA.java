package DSA;


import java.util.Scanner;

public class FirstDSA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number : ");
        int FirstNumber = input.nextInt();
        System.out.print("Please enter your second number : ");
        int SecondNumber = input.nextInt();

        int result = FirstNumber + SecondNumber;

        int a = 'A';
        byte num = (byte) (a);

        System.out.println(num);


        System.out.println("Your total bill is:" + result);

    }

}