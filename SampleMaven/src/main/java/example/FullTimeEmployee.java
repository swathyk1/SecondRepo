package example;

public class FullTimeEmployee extends Employee {

	
	double dailyPayment;

    FullTimeEmployee(String name, int employeeId, double dailyPayment) {
        super(name, employeeId);
        this.dailyPayment = dailyPayment;
    }

    // Implementation of abstract method
    @Override
   public double calculateSalary() {
        int workingHours = 8;
        return dailyPayment * workingHours;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contractor contractor = new Contractor("Sneha", 1, 500.0, 6);
        contractor.displayDetails();
        System.out.println("Contractor Salary: " + contractor.calculateSalary());
        System.out.println("--------------------------------");

        // Full-time employee
        FullTimeEmployee fullTime = new FullTimeEmployee("Swathy", 2, 1000.0);
        fullTime.displayDetails();
        System.out.println("Full-Time Employee Salary: " + fullTime.calculateSalary());
		 
		
	}

}
