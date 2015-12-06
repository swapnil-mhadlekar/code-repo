package com.techlabs.creational.factory.method.ex1;

public class ContactPage extends Page {

	public ContactPage(String details) {
		super(details);
	}

	@Override
	public void loadPage() {
		System.out.println("Contact Page is Loading.");
	}

}
