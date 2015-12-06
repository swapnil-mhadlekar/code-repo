package com.techlabs.srp.solution2;

public class Invoice2 {
	private double billAmount;
	private double taxRate;

	public Invoice2(double billAmount, double taxRate) {
		this.billAmount = billAmount;
		this.taxRate = taxRate;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public double calculateTax() {

		return this.billAmount * this.taxRate / 100;

	}

	public double calculateBillAmount() {
		return this.billAmount + calculateTax();

	}

}
