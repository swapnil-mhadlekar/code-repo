package com.techlabs.structural.decorator.ex1.test;

import com.techlabs.structural.decorator.ex1.ISandwich;
import com.techlabs.structural.decorator.ex1.MeatDecorator;
import com.techlabs.structural.decorator.ex1.SimpleSandwich;
import com.techlabs.structural.decorator.ex1.SourceDecorator;

public class TestSandwichDecorator {

	public static void main(String[] args) {
		ISandwich decorator = new SourceDecorator(new MeatDecorator(
				new SimpleSandwich()));
		System.out
				.println("Your Sandwich Order: " + decorator.getDescription());
		String cost = decorator.getCost();
		float actualCost = 0;

		String[] token = cost.split("\\+");

		for (String string : token) {
			actualCost = actualCost + Float.parseFloat(string);
		}

		System.out.println("	       Cost: " + cost + " = " + actualCost);

	}
}
