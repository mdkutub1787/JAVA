package vowelconsonent;

import java.util.Scanner;

/**
 *
 * @author MD KUTUB UDDIN
 */
public class VowelConsonent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char letter;
        System.out.print("Enter any letter : ");
        letter = input.next().toLowerCase().charAt(0);

        if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {

            if (letter == 'a') {
                System.out.println(letter+ "  is a Vowel");
            } else if (letter == 'e') {
                System.out.println(letter+ "  is a Vowel");
            } else if (letter == 'i') {
                System.out.println(letter+ "  is a Vowel");
            } else if (letter == 'o') {
               System.out.println(letter+ "  is a Vowel");
            } else if (letter == 'u') {
                System.out.println(letter+ "  is a Vowel");
            } else {
                System.out.println(letter+ "  is a Consonent");
            }
        } else {

            System.out.println(letter+ " invalid Alphabet");
        }

//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter a letter: ");
//        char letter = s.next().toLowerCase().charAt(0);
//
//        if (letter >= 'a' && letter <= 'z'|| letter >= 'A' && letter <= 'Z' ) {
//
//            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//                System.out.println(letter + " is a vowel.");
//            } else {
//                System.out.println(letter + " is a consonant.");
//            }
//        } else {
//            System.out.println("invalid Alphabet");
//        }
    }
}
