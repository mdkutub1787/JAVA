package mathematicalfunctionscharactersstrings;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class MathematicalFunctionsCharactersStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the letter grade (A, B, C, D, or F): ");
        char kutub = scanner.next().toUpperCase().charAt(0); 
        
        int numericValue;
        switch ( kutub) {
            case 'A':
                numericValue = 4;
                break;
            case 'B':
                numericValue = 3;
                break;
            case 'C':
                numericValue = 2;
                break;
            case 'D':
                numericValue = 1;
                break;
            case 'F':
                numericValue = 0;
                break;
            default:
                System.out.println("Invalid input. Please enter A, B, C, D, or F.");
                return; 
        }

        
        System.out.println("The numeric value of " + kutub + " is: " + numericValue);

       
    }
}
