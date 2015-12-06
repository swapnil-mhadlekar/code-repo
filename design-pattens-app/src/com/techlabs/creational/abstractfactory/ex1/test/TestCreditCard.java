package com.techlabs.creational.abstractfactory.ex1.test;

import com.techlabs.creational.abstractfactory.ex1.CardType;
import com.techlabs.creational.abstractfactory.ex1.CreditCard;
import com.techlabs.creational.abstractfactory.ex1.CreditCardFactory;
import com.techlabs.creational.abstractfactory.ex1.IVallidator;

public class TestCreditCard {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		CreditCardFactory factory = CreditCardFactory.getFactory(800);
		System.out.println(factory.getClass().getSimpleName());

		CreditCard card = factory.getCreditCard(CardType.PLATINUM);
		card.setCardNo(12345678);
		IVallidator validator = factory.getValidator(CardType.PLATINUM);
		System.out.println(validator.getClass().getSimpleName());
		if (validator.validate(card)) {
			System.out.println("Card is Valid.");
		} else
			System.out.println("Card is Invalid.");
	}

}
