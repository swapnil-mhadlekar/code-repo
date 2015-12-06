package com.structural.proxy.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountProxy extends Account {

	public AccountProxy(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Before Deposit: " + getTime());

		super.deposit(amount);
		System.out.println("After Deposit: " + getTime());
		System.out.println("-----------------Thank You------------");

	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Before Withdraw: " + getTime());

		super.withdraw(amount);
		System.out.println("After Withdraw: " + getTime());
		System.out.println("-----------------Thank You------------");

	}

	private String getTime() {
		SimpleDateFormat dateFormatter = new SimpleDateFormat(
				"dd-MM-YYYY  hh:mm:ss");
		return dateFormatter.format(new Date());

	}
}
