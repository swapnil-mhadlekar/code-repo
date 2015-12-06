package com.techlabs.behavioural.template;

public class BruCoffee extends CoffeeTemplate {

	@Override
	protected void boilWater() {
		System.out.println("Adding 1L water.");
	}

	@Override
	protected void addMilk() {
		System.out.println("Adding 1L milk.");
	}

	@Override
	protected void addSugar() {
		System.out.println("Adding 100gn sugar.");
	}

	@Override
	protected void addCoffeePowder() {
		System.out.println("Adding Bru Coffee powder");
	}

}
