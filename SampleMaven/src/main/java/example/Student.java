package example;

public class Student {
	String name;
    int roll;
    Address ref; // Aggregation - Student "has an" Address

    // Constructor
    Student(String name, int roll, Address ref) {
        this.name = name;
        this.roll = roll;
        this.ref = ref;
    }

	// Display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Address: " + ref.city + ", " + ref.state + ", " + ref.country);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Address object
        Address addr = new Address("Tvm", "kerala", "India");

        // Create Student object (aggregation)
        Student stud = new Student("Swathy", 1, addr);

        // Print details
        stud.displayDetails();
    }
	}


