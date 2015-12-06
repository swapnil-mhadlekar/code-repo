package com.techlabs.creational.factory.method.ex1;

public class ItemPage extends Page{

	public ItemPage(String details) {
		super(details);
	}

	@Override
	public void loadPage() {
		System.out.println("Item Page is loading.");
	}

}
