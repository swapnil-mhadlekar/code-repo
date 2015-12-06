package com.techlabs.structural.composite.ex1;

import java.util.List;

public class LineItem implements IOrderComponent {
	private int id;
	private String name;
	private int quantity;
	private double price;

	public LineItem(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public void displayOrderInfo() {
		System.out.println("Product id is : " + this.id + ", Product name is : "
				+ this.name + ", quantity is : " + this.quantity
				+ ", price is : " + this.price);

	}
}
