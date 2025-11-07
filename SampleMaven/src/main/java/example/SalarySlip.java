package example;

public class SalarySlip extends TotalSalary {
	 public void displaySlip() {
	        System.out.println("\n========== SALARY SLIP ==========");
	        System.out.println("Basic Pay     : ₹" + basicPay);
	        System.out.println("Deduction     : ₹" + deduction);
	        System.out.println("Bonus         : ₹" + bonus);
	        System.out.println("HRA (5%)      : ₹" + hra);
	        System.out.println("PF (20%)      : ₹" + pf);
	        System.out.println("---------------------------------");
	        System.out.println("Total Salary by Hand : ₹" + totalSalary);
	        System.out.println("=================================");
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip emp = new SalarySlip();

        emp.getDetails();          // From Employee
        emp.calculateComponents(); // From SalaryComponents
        emp.calculateTotal();      // From TotalSalary
        emp.displaySlip();         // From SalarySlip
    }
	}


