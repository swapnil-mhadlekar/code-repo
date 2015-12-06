package com.techlabs.creational.factory.method.ex1;

public abstract class Page {
	private String details;

	public Page(String details) {
		this.details = details;
	}
	
	public String getDetails() {
		return details;
	}

	abstract public void loadPage();
		
	

}
