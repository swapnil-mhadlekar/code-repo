package com.techlabs.behavioural.observer.ex1;

public class ATMScreen implements IAccountListener{

	@Override
	public void balancehanged(Account account) {
		System.out.println("Refreshing screen for : "+account.getName());
		System.out.println("Your current balance is : "+account.getBalance());
		System.out.println("----------------------------------------");
	}

}
