package bankmanagement;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class BankManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Initial balance : Tk ");
        double initialBalance = input.nextDouble();

        BankAccount ac = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an Option");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    double depositAmount = input.nextDouble();
                    ac.deposit(depositAmount);
                    break;
                case 2:
                    double withdrawAmount = input.nextDouble();
                    ac.withdraw(withdrawAmount);
                    break;
                case 3:
                    ac.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with bd!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }
    }

}
