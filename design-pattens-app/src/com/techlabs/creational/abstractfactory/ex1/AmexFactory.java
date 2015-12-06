package com.techlabs.creational.abstractfactory.ex1;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType type) {
		switch (type) {
		case GOLD:
			return new AmexGoldCard();
		case PLATINUM:
			return new AmexPlatinumCard();

		default:
			return null;
		}
	}

	@Override
	public IVallidator getValidator(CardType type) {
		switch (type) {
		case GOLD:
			return new AmexGoldValidator();
		case PLATINUM:
			return new AmexPlatinumValidator();

		default:
			return null;
		}
	}

}
