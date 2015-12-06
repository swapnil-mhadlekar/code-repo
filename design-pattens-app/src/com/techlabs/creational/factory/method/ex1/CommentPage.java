package com.techlabs.creational.factory.method.ex1;

public class CommentPage extends Page{

	public CommentPage(String details) {
		super(details);
	}

	@Override
	public void loadPage() {
		System.out.println("Comment Page is Loading.");
	}

}
