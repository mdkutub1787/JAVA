package recursion;

public class RecursionFactorial {

    public static void main(String[] args) {
        int n = 5; // Example number for which you want to calculate factorial
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive call to calculate factorial
        }
    }
}
