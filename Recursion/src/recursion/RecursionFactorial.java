package recursion;

public class RecursionFactorial {

    public static void main(String[] args) {
        int n = 5; 
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is : " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
}
