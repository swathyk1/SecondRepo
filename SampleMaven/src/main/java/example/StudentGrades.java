package example;
import java.util.Scanner;
public class StudentGrades {
	String name;
    int marks1, marks2, marks3;

    // Constructor to initialize student details
    public StudentGrades(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to determine grade based on total marks
    String determineGrade() {
        int total = calculateTotal();
        double percentage = total / 3.0;

        if (percentage >= 90)
            return "A";
        else if (percentage >= 75)
            return "B";
        else if (percentage >= 50)
            return "C";
        else
            return "D";
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Student 1
        System.out.print("Enter name of student 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter marks for subject 1: ");
        int s1m1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int s1m2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int s1m3 = sc.nextInt();
        sc.nextLine(); // consume newline

        StudentGrades student1 = new StudentGrades(name1, s1m1, s1m2, s1m3);

        // Student 2
        System.out.print("\nEnter name of student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter marks for subject 1: ");
        int s2m1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int s2m2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int s2m3 = sc.nextInt();

        StudentGrades student2 = new StudentGrades(name2, s2m1, s2m2, s2m3);

        // Display results for Student 1
        System.out.println("\nStudent: " + student1.name);
        System.out.println("Total Marks: " + student1.calculateTotal());
        System.out.println("Grade: " + student1.determineGrade());

        // Display results for Student 2
        System.out.println("\nStudent: " + student2.name);
        System.out.println("Total Marks: " + student2.calculateTotal());
        System.out.println("Grade: " + student2.determineGrade());

	}

}
