package bankmangmentproject;

public abstract class BankAccount extends BankManagement1 {


    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void checkbalance();

    public void checkBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
