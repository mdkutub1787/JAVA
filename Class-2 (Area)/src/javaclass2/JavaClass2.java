 package javaclass2;

import java.util.Scanner;

public class JavaClass2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Radius:");
        int radius = input.nextInt();
        double area;

        area = radius * radius * 3.1416;
        System.out.println(area);

//        int radius;
//        double area;
//        radius = 20;
//        area = radius * radius * 3.1416;
//        System.out.println(area);
    }

}
