package arraytest;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class ArrayTest {

    public static void main(String[] args) {

//        int[] number = new int[5];
//
//        number[0] = 10;
//        number[1] = 20;
//        number[2] = 60;
//        number[3] = 20;
//        number[4] = 90;
//
//        int len = number.length;
//        System.out.println("Array Size is : " + len);
//
//        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
//        System.out.println("Array Sum is : " + sum);







        //Userinput Array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");

        double[] number = new double[5];

        double sum = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println("The Sum is: " + sum);
        double avg = sum/number.length;
        System.out.println("Average is : " + avg);
    }
}

