package com.techlabs.behavioural.observer.ex1.test;

import com.techlabs.behavioural.observer.ex1.ATMScreen;
import com.techlabs.behavioural.observer.ex1.Account;
import com.techlabs.behavioural.observer.ex1.MobileAppScreen;

public class TestAccount {
	
	public static void main(String[] args){
		
		Account account1=new Account(101, "swap", 5000);
		account1.addAccountListener(new ATMScreen());
		account1.addAccountListener(new MobileAppScreen());
//		account1.deposit(1000);
		account1.withdraw(500);
		
		
	}
	}


