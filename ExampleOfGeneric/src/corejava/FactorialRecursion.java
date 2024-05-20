
//package corejava;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = 5; // Example number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        if (n == 0) { // Base case
            return 1;
        } else { // Recursive case
            return n * factorial(n - 1);
        }
    }
}
