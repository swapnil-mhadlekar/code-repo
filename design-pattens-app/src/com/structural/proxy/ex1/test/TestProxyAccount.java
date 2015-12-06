package com.structural.proxy.ex1.test;

import com.structural.proxy.ex1.AccountProxy;

public class TestProxyAccount {

	public static void main(String[] args) {
		AccountProxy proxy=new AccountProxy(101, "Swapnil", 10000);
		proxy.deposit(1000);
		proxy.withdraw(500);
		
	}

}
