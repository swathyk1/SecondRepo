package example;
import java.util.Scanner;
public class Emp {
	double basicPay, deduction, bonus;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ₹");
        basicPay = sc.nextDouble();

        System.out.print("Enter Deduction: ₹");
        deduction = sc.nextDouble();

        System.out.print("Enter Bonus: ₹");
        bonus = sc.nextDouble();
    }
}
