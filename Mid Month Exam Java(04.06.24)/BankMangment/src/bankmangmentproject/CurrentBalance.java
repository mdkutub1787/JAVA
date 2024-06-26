package bankmangmentproject;

public class CurrentBalance extends BankAccount {

    private double balance;

    public CurrentBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (balance >= amount) {
            balance += amount;
            System.out.println("Deposit : Tk " + amount);
            System.out.println("Current Balance : " + balance);

        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw : Tk " + amount);
            System.out.println("Current Balance : " + balance);
        } else if (amount >= 1000) {
            System.out.println("Intarest : Tk " + amount * 0.05);
            System.out.println("New Balance : " + (balance - (amount * 0.05)));

        } else {
            System.out.println("Insufficient Balance");

        }

    }
    @Override
    public void checkbalance() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
