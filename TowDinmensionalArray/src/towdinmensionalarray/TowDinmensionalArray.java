package towdinmensionalarray;

import java.util.Arrays;
import java.util.Random;

public class TowDinmensionalArray {

    public static void main(String[] args) {

        int[][] numer1 = new int[3][4];
        int[][] numer2 = new int[3][4];
        int[][] numer3 = new int[3][4];
        int[][] numer4 = new int[3][4];

        Random random = new Random();

        for (int row = 0; row < numer1.length; row++) {
            for (int column = 0; column < numer1[0].length; column++) {
                int randomNumber = random.nextInt(20);
                numer1[row][column] = randomNumber;
            }
        }
        for (int row = 0; row < numer2.length; row++) {
            for (int column = 0; column < numer2[0].length; column++) {
                int randomNumber = random.nextInt(20);
                numer2[row][column] = randomNumber;
            }
        }
        for (int row = 0; row < numer3.length; row++) {
            for (int column = 0; column < numer3[0].length; column++) {
                int randomNumber = random.nextInt(20);
                numer3[row][column] = randomNumber;
            }
        }
        for (int row = 0; row < numer4.length; row++) {
            for (int column = 0; column < numer4[0].length; column++) {
                int randomNumber = random.nextInt(20);
                numer4[row][column] = randomNumber;
            }
        }

        System.out.println(Arrays.deepToString(numer1));
        System.out.println(Arrays.deepToString(numer2));
        System.out.println(Arrays.deepToString(numer3));
        System.out.println(Arrays.deepToString(numer4));

    }

}
