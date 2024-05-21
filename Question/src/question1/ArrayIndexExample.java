package question1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class ArrayIndexExample {

    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index (0-99): ");

        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {

            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
