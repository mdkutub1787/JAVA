package main;


import finance.CheckingAccount;
import finance.SavingsAccount;


public class Main {

    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(75000);
        savingsAccount.calculateInterest();
        
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(75000);
        checkingAccount.withdraw(25000);
        System.out.println("Balance after withdraw: " + checkingAccount.getBalance());
        
    }
    
}
