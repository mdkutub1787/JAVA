package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = s.nextInt();

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;

        }
        System.out.println("Factorial : " + factorial);
    }

}
