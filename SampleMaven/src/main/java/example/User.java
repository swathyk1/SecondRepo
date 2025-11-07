package example;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Bank bankobj = new Bank();
        
        System.out.println("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        bankobj.setPin(enteredPin);  // set pin in Bank class

        // Validate the pin
        if (bankobj.validatePin()) {
        
            double balance = 1000.00; // initial balance
            System.out.println("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid amount.");
            } else if  (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance = balance - amount;
                System.out.println("Amount " +amount+" withdrawed successfully");
             //   System.out.println("Remaining balance: $" + balance);
            }
        } else {
            System.out.println("Invalid PIN.");
        }
        System.out.println("Thank you");
 
    }

	}


