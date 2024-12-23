package com.tech.spring.com.tech.bankemi;

public class EMICalculator {

	private double principleAmount;
	private double principleIntrest;
	private int tenure;

	public EMICalculator(double principleAmount, double principleIntrest, int tenure) {
		super();
		this.principleAmount = principleAmount;
		this.principleIntrest = principleIntrest;
		this.tenure = tenure;
	}
	
	public double calculateEMI() {
		double monthlyRate = principleIntrest / 12 / 100; 
        return principleAmount * monthlyRate * Math.pow(1 + monthlyRate, tenure) / (Math.pow(1 + monthlyRate, tenure) - 1);
	}
	
	public double calculateTotalAmount() {
        return calculateEMI() * tenure;
    }
	
    public void printAmortizationSchedule() {
        double emi = calculateEMI();
        double balance = principleAmount;
        double totalInterest = 0;

        System.out.println("Month | EMI Amount | Principal | Interest | Remaining Principal");
        for (int month = 1; month <= tenure; month++) {
            double interest = balance * (principleIntrest / 12 / 100);
            double principalPayment = emi - interest;
            balance = balance - principleAmount;
            totalInterest += interest;

            System.out.printf("%2d | %.2f | %.2f | %.2f | %.2f \n", month, emi, principalPayment, interest, balance);
        }
        System.out.printf("Total Interest: %.2f\n", totalInterest);
        System.out.printf("Total Amount Paid: %.2f\n", calculateTotalAmount());
    }

}
