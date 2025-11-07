package example;
import java.util.Scanner;
public class Palindrome {

    // Method 1: Static method to find the reverse of a number
    public static int findReverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
 // Method 2: Static method to check whether the number is palindrome or not
    static void checkPalindrome(int num) {
        int reversed = findReverse(num);
        if (num == reversed) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        checkPalindrome(number);
	}

}
