package example;

public class Discount {
	 // Method 1: Static method to calculate total amount
    public static double calculateTotal(double item1, double item2, double item3) {
        return item1 + item2 + item3;
    }
    // Method 2: Static method to check and apply discount
    static double applyDiscount(double totalAmount) {
        if (totalAmount > 5000) {
            double discount = totalAmount * 0.20; // 20% discount
            totalAmount -= discount;
            System.out.println("You got a 20% discount!");
        } else {
            System.out.println("No discount applied.");
        }
        return totalAmount;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Get prices using parameters
        double total = calculateTotal(250, 180, 120);

        // Check and apply discount
        double finalAmount = applyDiscount(total);

        // Print final amount
        System.out.println("Final amount to be paid: " + finalAmount);
	}

}
