package com.techlabs.creational.factory.method.ex1;

public class PaymentPage extends Page{

	public PaymentPage(String details) {
		super(details);
	}

	@Override
	public void loadPage() {
		System.out.println("Payment Page is loading.");
	}

}
