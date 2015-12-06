package com.techlabs.creational.abstractfactory.ex1;

public abstract class CreditCard {
	protected int cardNo;


	public int getCardNo() {
		return cardNo;
	}

	public int getCardLength() {
		return new Integer(cardNo).toString().length();

	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	
}
