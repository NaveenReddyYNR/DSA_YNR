package Personal;

import java.util.Scanner;

public class CharPrint {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your Char:");
        int result = in.next().trim().charAt(0);


        System.out.println("your character position is:" + result);


    }
}
