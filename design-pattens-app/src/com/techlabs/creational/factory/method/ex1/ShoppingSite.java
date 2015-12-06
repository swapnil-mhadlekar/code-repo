package com.techlabs.creational.factory.method.ex1;


public class ShoppingSite extends WebSite{


	@Override
	public void createPage() {
		pageList.add(new ItemPage("Line Items"));
		pageList.add(new CartPage("adding to cart"));
		pageList.add(new PaymentPage("Proceed to payment."));
	}

}
