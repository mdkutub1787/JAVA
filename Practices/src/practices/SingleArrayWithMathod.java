package practices;

import java.util.Random;

/**
 * @author MD KUTUB UDDIN
 */
public class SingleArrayWithMathod {

    public static void main(String[] args) {

        int[] myArray = new int[100];

        for (int i = 0; i <= myArray.length - 1; i++) {
            Random r = new Random();
            int number = r.nextInt(100) + 1;
            myArray[i] = number;

        }

        int max = maxNumber(myArray);
        System.out.println("Maximum number in the array: " + max);

        int min = minNumber(myArray);
        System.out.println("Minimum number in the array: " + min);
        
        int avg = avgNumber(myArray);
        System.out.println("Average number in the array: " + avg);

    }

    public static int maxNumber(int[] myArray) {
        int max = myArray[0];

        for (int value : myArray) {
            if (max < value) {
                max = value;
            }

        }

        return max;
    }

    public static int minNumber(int[] myArray) {
        int min = myArray[0];

        for (int value : myArray) {
            if (min > value) {
                min = value;
            }
        }

        return min;
    }

    public static int avgNumber(int[] myArray) {
        int sum = 0;

        for (int value : myArray) {
            sum += value;
        }

        return (int) sum / myArray.length;

    }
}
