package example;

public abstract class Employee {

	
	 String name;
	    int empId;

	    // Constructor
	   public  Employee(String name, int empId) {
	        this.name = name;
	        this.empId = empId;
	    }

	    // Abstract method
	    abstract double calculateSalary();

	    // Common method to display employee details
	    void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + empId);
	    }
	
}
