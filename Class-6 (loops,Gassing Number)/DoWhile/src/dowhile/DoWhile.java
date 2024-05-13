
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DoWhile {

  
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);

        int maxAttempts = 3;
        int attemptsCount = 0;

        do {
            System.out.println("Please enter your guess:");
            int guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the number!");
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Your guess is too low.");
            }  else if (guessNumber > randomNumber) {
                System.out.println("Your gues number is Higher");
            }

            attemptsCount++;
            
        } 
        while (attemptsCount < maxAttempts);

        if (attemptsCount == maxAttempts) {
            System.out.println("Sorry You loss the game and the guess number is  " + randomNumber);
        }

    }

}

        
        
        
        
        
        
        
        
        
        
    
    




       

