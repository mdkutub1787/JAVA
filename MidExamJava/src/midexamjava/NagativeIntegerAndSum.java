package midexamjava;

import java.util.Scanner;

public class NagativeIntegerAndSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Enter number :");
            double number = input.nextInt();

            if (number < 0) {
                break;
            } else {
                sum += number;
            }
        }
        System.out.println("Total Sum : " + sum);

    }

}
