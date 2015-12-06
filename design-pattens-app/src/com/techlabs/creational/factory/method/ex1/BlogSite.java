package com.techlabs.creational.factory.method.ex1;

public class BlogSite extends WebSite {

	@Override
	public void createPage() {
		pageList.add(new PostPage("Posting your page"));
		pageList.add(new CommentPage("Adding Comments"));
		pageList.add(new ContactPage("Cont: 9892996566"));
	}

}
