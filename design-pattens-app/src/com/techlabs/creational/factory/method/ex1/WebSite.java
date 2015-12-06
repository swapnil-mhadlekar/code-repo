package com.techlabs.creational.factory.method.ex1;

import java.util.*;


public abstract class WebSite {
	protected List<Page> pageList;
	

	public WebSite() {
		this.pageList = new ArrayList<Page>();
		createPage();
	}

	abstract public void createPage();

	public List<Page> getPageList() {
		return pageList;
	}

}
