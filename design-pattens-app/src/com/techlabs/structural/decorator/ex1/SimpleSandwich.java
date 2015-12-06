package com.techlabs.structural.decorator.ex1;

public class SimpleSandwich implements ISandwich{

	@Override
	public String getDescription() {
		return "BREAD";
	}

	@Override
	public String getCost() {
		return "20";
	}

}
