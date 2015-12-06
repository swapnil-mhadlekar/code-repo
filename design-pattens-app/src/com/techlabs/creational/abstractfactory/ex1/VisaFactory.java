package com.techlabs.creational.abstractfactory.ex1;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType type) {
		switch (type) {
		case GOLD:
			return new VisaGoldCard();
		case PLATINUM:
			return new VisaPlatinumCard();

		default:
			return null;
		}
	}

	@Override
	public IVallidator getValidator(CardType type) {
		switch (type) {
		case GOLD:
			return new VisaGoldValidator();
		case PLATINUM:
			return new VisaPlatinumValidator();

		default:
			return null;
		}
	}

}
