package midexamjava;

import java.util.Scanner;

public class LowestAndHightNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int lowest = numbers[0];
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println("Lowest number is  : " + lowest);
        System.out.println("Highest number is : " + highest);

    }
}
