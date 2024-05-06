package testmethod;

import java.util.Random;
import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
//public class RandomPassGenerate {
//    public static void main(String[] args) {
//        String randomPassword = "";
//
//        for (int i = 0; i < 7; i++) {
//            if (i == 3) {
//                randomPassword += "-";
//                continue;
//            }
//            randomPassword += getRandomCharOrNumber();
//        }
//
//        System.out.println(randomPassword);
//
//    }
//
//    public static char getRandomCharOrNumber() {
//        double numberOrChar = Math.random();
//
//        if (numberOrChar < 0.3) {
//            int asciiValueNumber = (int) (Math.random() * (57 - 48 + 1)) + 48;
//            return (char) asciiValueNumber;
//        }
//        if (numberOrChar > 0.4 && numberOrChar < 0.7) {
//            int asciiValueUppercaseChar = (int) (Math.random() * (90 - 65 + 1)) + 65;
//            return (char) asciiValueUppercaseChar;
//        }
//        int asciiValueLowercaseChar = (int) (Math.random() * (122 - 97 + 1)) + 97;
//        return (char) asciiValueLowercaseChar;
//    }
//}
public class RandomPassGenerator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Random random = new Random();
        System.out.print("Enter password length :");
        int passLength = s.nextInt();

        String pass = "";
        String finalPassword = "";

        for (int i = 1; i <= passLength; i++) {

            int range = random.nextInt(3) + 1;
            switch (range) {
                case 1:
                    pass += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    pass += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    pass += (char) (random.nextInt(10) + 48);
                    break;
            }

        }

        for (int i = 0; i < pass.length(); i++) {

            if (i == pass.length() / 2) {
                finalPassword += "_" + pass.charAt(i);
            } else {
                finalPassword += pass.charAt(i);

            }

        }

        System.out.println(finalPassword);

    }

}
