package primenumofcountallprime;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class PrimeNumOfCountAllPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Start Number : ");
        System.out.println("Enter End Number :");
        int startNumber = input.nextInt();
        int endNumber = input.nextInt();

        int primeCount = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number : " + i);
                primeCount++;
            }

        }
        System.out.println("Count of prime numbers: " + primeCount);

    }

}
