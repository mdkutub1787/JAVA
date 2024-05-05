package practices;

import java.util.Random;
import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class RandomPassword {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Password Length : ");
        int passLength = s.nextInt();

        String password = passGenerator(passLength); // Corrected method name
        System.out.println("Password is : " + password);

    }

    public static String passGenerator(int passLength) { // Corrected method signature

        Random random = new Random();

        String password = "";
        String finalPassword = "";

        for (int i = 1; i <= passLength; i++) { // Corrected loop initialization
            int range = random.nextInt(4) + 1;
            switch (range) {
                case 1:
                    password += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    password += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    password += (char) (random.nextInt(10) + 48);
                    break;
                case 4:
                    password += (char) (random.nextInt(16) + 32);
                    break;

            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (i == password.length() / 2) {
                finalPassword += "_" + password.charAt(i);
            } else {
                finalPassword += password.charAt(i);
            }
        }
        return finalPassword;
    }

}
