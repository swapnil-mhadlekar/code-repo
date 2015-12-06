package com.techlabs.srp.solution1;

public class Invoice {
	private double billAmount;
	private double taxRate;

	public Invoice(double billAmount, double taxRate) {
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

	public void printInvoice(Invoice invoice) {
		System.out.println("Bill Amount is: " + invoice.getBillAmount()
				+ ",Tax Rate is: " + invoice.getTaxRate()
				+ ",Total Amount Payable is: " + invoice.calculateBillAmount());

	}

}
