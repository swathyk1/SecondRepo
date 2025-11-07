package example;
import java.util.Scanner;
public class Factorial {
    
	
	 int number;     // instance variable
	    long factorial; // instance variable to store result

	    // Method 1: Calculate factorial
	    public void calculateFactorial(int number) {
	        this.number = number; // assign argument to instance variable
	        factorial = 1;

	        for (int i = 1; i <= this.number; i++) {
	            factorial = factorial* i;
	        }

	        // Call print method using this
	        this.printResult();
	    }

	    // Method 2: Print the result
	    public void printResult() {
	        System.out.println("Number: " + this.number);
	        System.out.println("Factorial: " + this.factorial);
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        Factorial obj = new Factorial();

        // Invoke only the calculateFactorial method
        obj.calculateFactorial(num);
	}

	

}
