package com.techlabs.structural.decorator.ex1;

public class SourceDecorator extends SandwichDecorator {

	public SourceDecorator(ISandwich customSandwich) {
		super(customSandwich);
		
	}

	@Override
	public String getDescription() {
		return customSandwich.getDescription() + addSource();
	}

	private String addSource() {
		return "+ MAYO";

	}

	@Override
	public String getCost() {
		return customSandwich.getCost()+addSauceCost();
	}
	private String addSauceCost() {
		return "+10";
		
	}
}
