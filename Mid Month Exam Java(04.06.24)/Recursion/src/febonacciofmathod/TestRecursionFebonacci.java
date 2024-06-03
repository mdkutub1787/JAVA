package febonacciofmathod;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class TestRecursionFebonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The  Number : ");
        long f = scanner.nextInt();

        SubFebonacci feb = new SubFebonacci();
        System.out.println("Febonacci of " + f + "  is : " + feb.febonacci(f));

    }
}
