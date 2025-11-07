package example;
import java.util.Scanner;
public class Result extends Add {
  
	public void check(int a, int b) {
        // Call parent class method using super
        int result = super.addNumbers(a, b);

        System.out.println("\nSum of the numbers: " + result);

        // Check divisibility by 10
        if (result % 10 == 0) {
            System.out.println(" Divisible by 10.");
        } else {
            System.out.println("NOT divisible by 10.");
        }
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        // Create object of child class
	        Result obj = new Result();
	        obj.check(num1, num2);

	}

}
