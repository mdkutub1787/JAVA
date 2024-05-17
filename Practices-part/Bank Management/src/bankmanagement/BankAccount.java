package bankmanagement;

/**
 * @author MD KUTUB UDDIN
 */
public class BankAccount {

    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: Tk " + amount);
        System.out.println("Current Balance " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: Tk " + amount);
            System.out.println("Current Balance " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

    }

    public void checkBalance() {

        System.out.println(balance);

    }

}
