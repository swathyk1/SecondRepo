package example;

public class Salary extends Emp {
	double hra, pf;

    void calculateComponents() {
        hra = 0.05 * basicPay;  // 5% of basic pay
        pf = 0.20 * basicPay;   // 20% of basic pay
    }
}
