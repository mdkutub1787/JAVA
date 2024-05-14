package midexamjava;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = s.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("It is a Prime Number ");
        } else {
            System.out.println("It is a Not  Prime Number ");
        }
    }

}
