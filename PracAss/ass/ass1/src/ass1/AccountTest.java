package ass1;

public class AccountTest {
	 public static void main(String[] args) {
	        
	        Account acc1 = new Account("John Doe", 500.0);

	        
	        acc1.deposit(200);      
	        acc1.deposit(-50);      

	        
	        acc1.withdraw(100);     
	        acc1.withdraw(700);     

	      
	        acc1.getBalance();
	    }
}
