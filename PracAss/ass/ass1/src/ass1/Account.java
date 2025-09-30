package ass1;

public class Account extends Bank{
	 public Account(String accountName, double balance) {
	        super(accountName, balance);
}
	 public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Withdrawal amount exceeded account balance");
	            recordTransaction(accountName + " attempted withdrawal of " + amount + " (FAILED)");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	            recordTransaction(accountName + " withdrew " + amount + "; New balance: " + balance);
	        }
	    }
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	            recordTransaction(accountName + " deposited " + amount + "; New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount");
	            recordTransaction(accountName + " attempted invalid deposit of " + amount + " (FAILED)");
	        }
	    }
	 public double getBalance() {
	        System.out.println("Current balance: " + balance);
	        recordTransaction(accountName + " checked balance: " + balance);
	        return balance;
	    }
	}