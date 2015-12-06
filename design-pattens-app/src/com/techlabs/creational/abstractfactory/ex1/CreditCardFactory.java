package com.techlabs.creational.abstractfactory.ex1;


public abstract class CreditCardFactory {
	public static CreditCardFactory getFactory(int creditScore) {

		if (creditScore > 1000) {
			return new VisaFactory();

		} else {
			return new AmexFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType type);

	public abstract IVallidator getValidator(CardType type);
}
