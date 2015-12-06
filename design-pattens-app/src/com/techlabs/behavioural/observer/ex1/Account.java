package com.techlabs.behavioural.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private String name;
	protected double balance;
	private List<IAccountListener> listenerList;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.listenerList = new ArrayList<IAccountListener>();
	}

	private void notifyAllListeners() {
		for (IAccountListener accountListener : listenerList) {
			accountListener.balancehanged(this);
		}

	}

	public void addAccountListener(IAccountListener listener) {
		listenerList.add(listener);

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
		balance = balance + amount;
		System.out.println("Amount Deposited Successfully !!");
		notifyAllListeners();

	}

	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("Amount Withdrawn Successfully !!");
		notifyAllListeners();
	}

}
