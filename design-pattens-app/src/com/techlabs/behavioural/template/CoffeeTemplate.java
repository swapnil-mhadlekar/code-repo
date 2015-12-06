package com.techlabs.behavioural.template;

public abstract class CoffeeTemplate {

	public final void prepareCofee() {
		boilWater();
		addMilk();
		addSugar();
		addCoffeePowder();
		System.out.println("Coffee is Ready.");
	}

	protected abstract void addCoffeePowder();

	protected abstract void addSugar();

	protected abstract void addMilk();

	protected abstract void boilWater();

}
