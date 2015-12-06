package com.structural.proxy.ex1;

public class Account {

	private int accountNumber;
	private String name;
	protected double balance;

	public Account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;

	}

	public String getName() {
		return name;

	}

	public double getBalance() {
		return balance;

	}

	public void deposit(int amount) {
		System.out.println("Successfully Deposited Rs."+amount);
		balance = balance + amount;

	}

	public void withdraw(int amount) {
		System.out.println("Successfully Withdrawn Rs. "+amount);
		balance = balance - amount;

	}

}
