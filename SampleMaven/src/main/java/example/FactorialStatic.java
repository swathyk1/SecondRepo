package example;
import java.util.Scanner;
public class FactorialStatic {

    // Static method to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        long result = factorial(number);

	        System.out.println("Factorial of " + number + " is " + result);
	}

}
