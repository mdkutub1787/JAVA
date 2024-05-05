package practices;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, number;

        System.out.println("Enter Any Number : ");
        number = input.nextInt();

        temp = number;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if (number == sum) {
            System.out.println("Palindrome number");

        } else {
            System.out.println("Not Palindrome number");
        }
    }

}
