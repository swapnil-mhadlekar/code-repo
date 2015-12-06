package com.techlabs.structural.decorator.ex1;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(ISandwich customSandwich) {
		super(customSandwich);

	}

	@Override
	public String getDescription() {
		return customSandwich.getDescription() + addMeat();
	}

	private String addMeat() {
		return "+ TURKEY";

	}

	@Override
	public String getCost() {
		return customSandwich.getCost() + addMeatCost();
	}

	public String addMeatCost() {
		return "+15";
	}
}
