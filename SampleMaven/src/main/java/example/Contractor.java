package example;

public class Contractor extends Employee {

	double paymentPerHour;
    int workingHours;

   public  Contractor(String name, int empId, double paymentPerHour, int workingHours) {
        super(name, empId);
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    // Implementation of abstract method
    @Override
    public double calculateSalary() {
    	double c = paymentPerHour * workingHours;
        return c;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
