package example;

public class Onseason {

	
	public void discount(double price) {
        double discountRate = 0.40; // 40% for Onseason
        double discountedPrice = price - (price * discountRate);
        System.out.println("\n--- Onseason Purchase ---");
        System.out.println("Original Price: " + price);
        System.out.println("Discount: 40%");
        System.out.println("Price after Discount: " + discountedPrice);
    }
	
}
