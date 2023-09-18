package DSA;

import java.util.Scanner;

public class PrintOneToHundred {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        for (int count = start; count <= end; count++) {

            System.out.println(count);
        }
    }

}
