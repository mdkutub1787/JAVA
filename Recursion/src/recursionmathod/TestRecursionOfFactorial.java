package recursionmathod;

import java.util.Scanner;

public class TestRecursionOfFactorial {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int fac=scanner.nextInt();
        
        SubRecursion r=new SubRecursion();
        System.out.println("factorial of " + fac + " is :" +r.factorial(fac));
         
    }

}


