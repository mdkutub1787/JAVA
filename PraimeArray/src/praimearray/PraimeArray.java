package praimearray;
//import java.util.Random;

import java.util.Arrays;

/**
 * @author MD KUTUB UDDIN
 */
public class PraimeArray {

    public static void main(String[] args) {

        int[] primeArray = getPrimeArray();
        System.out.println(Arrays.toString(primeArray));

    }

    public static int[] getPrimeArray() {
        int[] primeArray = new int[100];

        int index = 0;
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count += 1;
                }

            }
            if (count == 2) {
                primeArray[index] = i;
                index++;
            }
        }
        return primeArray;

    }
}

//        int[] myArray = new int[100];
//
//        Random r = new Random(); 
//
//        for (int i = 0; i < myArray.length; i++) {
//            int number = r.nextInt(100) + 1;
//            myArray[i] = number;
//        }
//
//        for (int i = 0; i < myArray.length; i++) {
//            if (isPrime(myArray[i])) {
//                System.out.println(myArray[i] + " is Prime Number");
//            } else {
//                System.out.println(myArray[i] + " is Not Prime Number");
//            }
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

