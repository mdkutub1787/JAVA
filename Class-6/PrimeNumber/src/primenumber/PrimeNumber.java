package primenumber;



public class PrimeNumber {

    public static void main(String[] args) {

        
        int userInput = input.nextInt();
        int count = 0;

        for (int i = 1; i <= userInput; i++) {

            if (userInput % i == 0) {
                count += 1;
            }
        }

        if (count == 2) {
            System.out.println("It is Prime Number");

        } else {
            System.out.println("It is Not Prime Number");
        }

    }

}
