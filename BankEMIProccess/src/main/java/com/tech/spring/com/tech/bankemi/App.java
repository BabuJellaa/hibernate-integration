package com.tech.spring.com.tech.bankemi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

public class App{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter principle amount : ");
		double principleAmount = scanner.nextDouble();

		System.out.println("Emter annual intrest : ");
		double annualIntrest = scanner.nextDouble();

		System.out.println("Enter tenure in months : ");
		int tenure = scanner.nextInt();

		EMICalculator calculator = new EMICalculator(principleAmount, annualIntrest, tenure);

		double monthlyEMI = calculator.calculateEMI();

		List<LoanEMIDetails> emiDetails = new ArrayList<LoanEMIDetails>();
		double amount = principleAmount;

		for(int month=1; month<=tenure ; month++) {
			double interest = amount * (annualIntrest/12/100);
			double principleAmountPaid = monthlyEMI - interest;
			amount -= principleAmountPaid;
			emiDetails.add(new LoanEMIDetails(month, monthlyEMI, principleAmountPaid, interest, amount));
		}

		PDFGenerator pdfGenerator = new PDFGenerator();
		try {
			try {
				pdfGenerator.exportToPDF(emiDetails, "C:\\Users\\Jella Babu\\emi_schedule.pdf");
				
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
