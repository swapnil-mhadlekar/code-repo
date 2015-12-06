package com.techlabs.creational.factory.method.ex1;

public class CartPage extends Page {

	public CartPage(String details) {
		super(details);
	}

	@Override
	public void loadPage() {
		System.out.println("Cart Page is loading.");
	}

}
