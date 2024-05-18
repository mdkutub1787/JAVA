package recursion;

public class FindFibonacci {

    public static void main(String[] args) {

        System.out.println(findFibonaccy(10));

    }

    public static long findFibonaccy(int index) {

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;

        } else {

            return findFibonaccy(index - 1) + findFibonaccy(index - 2);
        }

    }

}
