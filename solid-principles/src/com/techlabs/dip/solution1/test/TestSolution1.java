package com.techlabs.dip.solution1.test;

import com.techlabs.dip.solution1.LogType;
import com.techlabs.dip.solution1.TaxCalculator;

public class TestSolution1 {

	public static void main(String[] args) {
		
		TaxCalculator calculator=new TaxCalculator(10000, 0, LogType.XMLErroeLogger);
		System.out.println(calculator.calculateTax());
	}

}
