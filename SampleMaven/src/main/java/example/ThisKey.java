package example;
import java.util.Scanner;
public class ThisKey {
	int number; // instance variable

    // Constructor 1: Display message
    public ThisKey() {
        System.out.println("Finding reverse...");
    }

    // Constructor 2: Calculate reverse (uses this keyword)
    public ThisKey(int number) {
        this(); // calls the first constructor
        this.number = number; // assigning argument to instance variable

        int reverse = 0;
        int temp = this.number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Original Number: " + this.number);
        System.out.println("Reversed Number: " + reverse);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its reverse: ");
        int num = sc.nextInt();

        // Invoke only one constructor
        ThisKey obj = new ThisKey(num);

	}

}
