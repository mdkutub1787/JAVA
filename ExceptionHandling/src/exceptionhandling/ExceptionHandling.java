package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number :");
        double number1 = input.nextDouble();

        System.out.println("Enter second Number :");
        double number2 = input.nextDouble();
        
        try {

            if (number2 == 0) {
                System.out.println("Divisor cannot be zero ");
            } else {
                System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
            }

        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be divided by zero ");
        }
    }
}



