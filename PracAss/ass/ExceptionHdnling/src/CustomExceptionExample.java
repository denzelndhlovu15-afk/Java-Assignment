
public class CustomExceptionExample {
	 public static void main(String[] args) {
	        int number = -10;  

	        try {
	            if (number < 0) {
	                throw new MyCustomException("Number cannot be negative!");
	            } else {
	                System.out.println("The number is: " + number);
	            }
	        } catch (MyCustomException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}

