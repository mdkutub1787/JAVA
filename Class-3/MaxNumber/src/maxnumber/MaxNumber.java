package maxnumber;

import java.util.Scanner;

/**
 *
 * @author MD KUTUB UDDIN
 */
public class MaxNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber;
        System.out.println("Enter First Number");
       int firstNumber = input.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = input.nextInt();

        System.out.println("Enter Third Number");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maxNumber = firstNumber;
            
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            maxNumber = secondNumber;
            
        } else {
            maxNumber = thirdNumber;
        }
        
        System.out.println("Max Number is : " + maxNumber);
    }
}
