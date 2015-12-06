package com.techlabs.creational.factory.method.ex1.test;

import java.util.List;

import com.techlabs.creational.factory.method.ex1.Page;
import com.techlabs.creational.factory.method.ex1.WebSite;
import com.techlabs.creational.factory.method.ex1.WebSiteFactory;
import com.techlabs.creational.factory.method.ex1.WebSiteType;

public class TestPage {
	public static void main(String[] args) {

		WebSite website1 = WebSiteFactory.INSTANCE
				.createWebsite(WebSiteType.SHOP);
		List<Page> pageList1 = website1.getPageList();
		printPageList(pageList1);

		WebSite website2 = WebSiteFactory.INSTANCE
				.createWebsite(WebSiteType.BLOG);
		pageList1 = website2.getPageList();
		printPageList(pageList1);

	}

	private static void printPageList(List<Page> pageList1) {
		for (Page page : pageList1) {
			page.loadPage();
		}
		System.out.println("------------------------");

	}

}
