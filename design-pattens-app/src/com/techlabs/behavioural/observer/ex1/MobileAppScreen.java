package com.techlabs.behavioural.observer.ex1;

public class MobileAppScreen implements IAccountListener{

	@Override
	public void balancehanged(Account account) {
		System.out.println("refreshing mobile app screen for : "+account.getName());
		System.out.println("Your account balance is : "+account.getBalance());
		System.out.println("------------------------------------------");
	}

}
