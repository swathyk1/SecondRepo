package example;
import java.util.Scanner;

public class Offseason extends Onseason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double price = sc.nextDouble();

        System.out.print("Enter the season (Onseason / Offseason): ");
        String seasonType = sc.next();
        Offseason obj1 = new Offseason();
        // Polymorphism: parent class reference
        if (seasonType.equalsIgnoreCase("Onseason")|| seasonType.equalsIgnoreCase("Offseason")){
           
            obj1.discount(price);
        } 
        else {
            System.out.println("Invalid season type entered!");
        }

       
	}

	@Override
	public void discount(double price) {
		// TODO Auto-generated method stub
		super.discount(price);
		 double discountRate = 0.15; // 15% for Offseason
	        double discountedPrice = price - (price * discountRate);
	        System.out.println("\n--- Offseason Purchase ---");
	        System.out.println("Original Price: " + price);
	        System.out.println("Discount: 15%");
	        System.out.println("Price after Discount: " + discountedPrice);
	}

}
