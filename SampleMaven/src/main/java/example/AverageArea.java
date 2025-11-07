package example;
import java.util.Scanner;
public class AverageArea {
	// ---------------- Average Methods ----------------

    // Average of three integers
    double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Average of three floats
    float average(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    // ---------------- Area Methods ----------------

    // Area of circle
    double area(double radius) {
        return 3.14159 * radius * radius;
    }

    // Area of rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of square
    double area(int side) {
        return side * side;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AverageArea aa = new AverageArea();

        // Average of integers
        System.out.println("Enter three integers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        System.out.println("Average of integers: " + aa.average(i1, i2, i3));

        // Average of floats
        System.out.println("\nEnter three floats: ");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();
        System.out.println("Average of floats: " + aa.average(f1, f2, f3));

        // Area of circle
        System.out.print("\nEnter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle: " + aa.area(r));

        // Area of rectangle
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of rectangle: " + aa.area(l, b));

        // Area of square
        System.out.print("\nEnter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of square: " + aa.area(s));
	}

}
