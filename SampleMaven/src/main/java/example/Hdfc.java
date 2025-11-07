package example;

public class Hdfc implements Rbi {

	
	
	@Override
	public void recurringDeposit(double monthlyDeposit, int months) {
		// TODO Auto-generated method stub
		double r = intrate / 100 / 12; 
		// RD maturity formula:
        // M = P * n + P * n * (n + 1) * r / 2
        // where:
        // M = maturity value
        // P = monthly installment
        // n = number of months
        // r = rate of interest per month
        double maturityAmount = (monthlyDeposit * months) + 
                                (monthlyDeposit * months * (months + 1) * r) / 2;

        System.out.println("Monthly Deposit: "+ monthlyDeposit);
        System.out.println("Duration in months: "+ months);
        System.out.println("Interest Rate: " + intrate);
        System.out.println("Maturity Amount after the duration: " + maturityAmount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hdfc obj = new Hdfc();

	        // Example: Rs. 5000 deposit for 24 months
		 obj.recurringDeposit(5000, 24);
		 
		 Rbi obj1 = new Hdfc();
		 obj1.recurringDeposit(5000, 24);
	}

}
