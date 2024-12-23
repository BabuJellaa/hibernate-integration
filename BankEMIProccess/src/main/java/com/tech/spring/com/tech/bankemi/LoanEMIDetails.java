package com.tech.spring.com.tech.bankemi;

public class LoanEMIDetails {
	
	public LoanEMIDetails(int month, double emiAmount, double principleAmount, double principleIntrest, double dueAmount) {
		super();
		this.month = month;
		this.emiAmount = emiAmount;
		this.principleAmount = principleAmount;
		this.principleIntrest = principleIntrest;
		this.dueAmount = dueAmount;
	}
	
	private int month;
	private double emiAmount;
	private double principleAmount;
	private double principleIntrest;
	private double dueAmount;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}
	public double getPrincipleIntrest() {
		return principleIntrest;
	}
	public void setPrincipleIntrest(double principleIntrest) {
		this.principleIntrest = principleIntrest;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
}
