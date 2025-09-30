package ass1;
import java.io.FileWriter;
import java.io.IOException;


public abstract class Bank {
	protected String accountName;
    protected double balance;
    
    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    
    protected void recordTransaction(String message) {
        try (FileWriter fw = new FileWriter("Bank.txt", true)) {
            fw.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to Bank.txt: " + e.getMessage());
        }
    }

}
