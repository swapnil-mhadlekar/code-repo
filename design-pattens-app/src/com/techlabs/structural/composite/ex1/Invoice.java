package com.techlabs.structural.composite.ex1;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent {
	List<IOrderComponent> list;
	private String description;

	public Invoice(String description) {
		this.list = new ArrayList<IOrderComponent>();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void add(IOrderComponent component) {
		this.list.add(component);
	}

	@Override
	public void displayOrderInfo() {
		System.out.println("\n-----------------[ Displaying Invoice Details of : "
				+ this.description+" ]-----------------------\n");
		for (IOrderComponent orderComponent : list) {
			orderComponent.displayOrderInfo();
		}

	}

}
