package com.techlabs.structural.adapter.ex1.oldvendor;

public class Goods {
	private String name;
	private int quantity;
	private double price;

	public Goods(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
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

	public double calculateDiscount() {
		return quantity * price;

	}

	public double getDiscount() {
		return calculateDiscount() * 0.4;
	}
}
