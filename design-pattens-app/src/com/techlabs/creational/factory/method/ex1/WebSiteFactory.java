package com.techlabs.creational.factory.method.ex1;

public enum WebSiteFactory {
	INSTANCE;
	public WebSite createWebsite(WebSiteType type) {
		switch (type) {
		case BLOG:
			return new BlogSite();

		case SHOP:
			return new ShoppingSite();
		default:
			return null;
		}
	}
}
