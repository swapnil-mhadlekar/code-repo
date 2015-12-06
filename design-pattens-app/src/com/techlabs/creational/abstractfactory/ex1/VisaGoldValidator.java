package com.techlabs.creational.abstractfactory.ex1;

public class VisaGoldValidator implements IVallidator {
	@Override
	public boolean validate(CreditCard card) {
		return card.getCardLength() > 1;
	}
}
