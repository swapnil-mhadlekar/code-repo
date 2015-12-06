package com.techlabs.dip.solution2.test;

import com.techlabs.dip.solution2.EmailErrorLogger;
import com.techlabs.dip.solution2.TaxCalculator;

public class TestSolution2 {

	public static void main(String[] args) {
		TaxCalculator calculator = new TaxCalculator(10000, 0,
				new EmailErrorLogger());
		System.out.println(calculator.calculateTax());
	}

}
