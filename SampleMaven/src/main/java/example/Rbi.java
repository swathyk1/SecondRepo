package example;

public interface Rbi {

	
	 // Define interest rate (annual interest in %)
    double intrate = 6.5; // 6.5% per annum

    // Abstract method to calculate RD maturity
   public abstract void recurringDeposit(double monthlyDeposit, int months);
	
}
