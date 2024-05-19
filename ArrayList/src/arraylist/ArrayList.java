package arraylist;

import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + " : ");
            number[i] = input.nextInt();
        }

        int lowest = number[0];
        int highest = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > highest) {
                highest = number[i];
            } else {
                lowest = number[i];
            }

        }
        System.out.println("Highest number is : " + highest);
        System.out.println("Lowest number is  : " + lowest);

    }
}

