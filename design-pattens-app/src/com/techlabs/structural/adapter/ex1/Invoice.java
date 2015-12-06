package com.techlabs.structural.adapter.ex1;

public class Invoice implements IDiscountable {
	private String name;
	private double billAmount;

	public Invoice(String name, double billAmount) {
		this.name = name;
		this.billAmount = billAmount;
	}

	public String getName() {
		return name;
	}

	public double getBillAmount() {
		return billAmount;
	}

	@Override
	public String getDescription() {
		return String.format("Invoice name is: %s, Total billing amount is: %s",
				this.name, this.billAmount);
	}

	@Override
	public double calaculateDiscount() {
		System.out.print("Discount is: ");
		return this.billAmount * 0.2;
	}

}
