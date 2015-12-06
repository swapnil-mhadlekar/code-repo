package com.techlabs.behavioural.template;

public class Nescafe extends CoffeeTemplate{

	@Override
	protected void boilWater() {
		System.out.println("Adding 2L water.");
	}

	@Override
	protected void addMilk() {
		System.out.println("Adding 2L milk.");
	}

	@Override
	protected void addSugar() {
		System.out.println("Adding 200gn sugar.");
	}

	@Override
	protected void addCoffeePowder() {
		System.out.println("Adding Nescafe Coffee powder");
	}

}
