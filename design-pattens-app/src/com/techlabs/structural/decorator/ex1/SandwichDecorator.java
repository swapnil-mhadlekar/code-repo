package com.techlabs.structural.decorator.ex1;

public abstract class SandwichDecorator implements ISandwich{
	protected ISandwich customSandwich;

	public SandwichDecorator(ISandwich customSandwich) {
		this.customSandwich = customSandwich;
	}
	
}
