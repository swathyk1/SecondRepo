package example;
import java.util.Scanner;
public class VotingEligibility {
	 // Static method to check voting eligibility
   public static boolean isEligible(int age) {
        return age >= 18; // returns true if age is 18 or above, else false
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        if (isEligible(age)) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote.");
	        }
	}

}
