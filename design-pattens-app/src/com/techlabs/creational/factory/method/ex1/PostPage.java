package com.techlabs.creational.factory.method.ex1;

public class PostPage extends Page {

	public PostPage(String details) {
		super(details);
	}

	@Override
	public void loadPage() {
		System.out.println("Post Page is Loading.");
	}

}
