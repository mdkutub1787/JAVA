package practices;

import java.util.Arrays;
import java.util.Random;

/**
 * @author MD KUTUB UDDIN
 */
public class SingleArray {

    public static void main(String[] args) {

        int[] myArray = new int[100];

        for (int i = 0; i <= myArray.length - 1; i++) {
            Random r = new Random();
            int number = r.nextInt(100) + 1;
            myArray[i] = number;

        }

        int sum = 0;
        int avg = 0;
        int count = 0;
        int max = 0;
        int min = 999999999;

        for (int value : myArray) {
            sum += value;

        }

        avg = sum / myArray.length;

        for (int value : myArray) {
            if (value > avg) {
                count += 1;

            }
        }

        for (int value : myArray) {
            if (max < value) {
                max = value;
            }

            if (min > value) {
                min = value;
            }

        }
        
        

        System.out.println(Arrays.toString(myArray));

        System.out.println("Sum Number : " + sum);
        System.out.println("Avg Number : " + avg);
        System.out.println("Count Avg > Number : " + count);
        System.out.println("Max Number : " + max);
        System.out.println("Min Number : " + min);
    }

}
