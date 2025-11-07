package example;

public class TotalSalary extends Salary {
	double totalSalary;

    void calculateTotal() {
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }
}
