package com.techlabs.behavioural.template.test;

import com.techlabs.behavioural.template.BruCoffee;
import com.techlabs.behavioural.template.CoffeeTemplate;
import com.techlabs.behavioural.template.Nescafe;

public class TestCoffeeTemplate {
	public static void main(String[] args) {
		CoffeeTemplate coffee;
		coffee=new BruCoffee();
		coffee.prepareCofee();
		System.out.println("---------------------");
		coffee=new Nescafe();
		coffee.prepareCofee();
	}
	
}
