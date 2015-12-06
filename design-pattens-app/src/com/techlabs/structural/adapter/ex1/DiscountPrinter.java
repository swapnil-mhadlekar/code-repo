package com.techlabs.structural.adapter.ex1;

public class DiscountPrinter {
	public void printAsPDF(IDiscountable object) {
		System.out.println(object.getDescription());
		System.out.println(object.calaculateDiscount());

	}
}
