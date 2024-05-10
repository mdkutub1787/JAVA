package breack.pkgcontinue;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class BreackContinue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        while (true) {
            System.out.println("Enter Number: ");
            double number = scanner.nextInt();
            if (number < 0) {
                break;
            } else {
                sum += number;
            }
        }
        System.out.println("Sum: " + sum);

    }

}
