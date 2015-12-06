package com.techlabs.ocp.solution2.test;

import com.techlabs.ocp.solution2.DiwaliRate;
import com.techlabs.ocp.solution2.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit = new FixedDeposit(100000, 5,
				new DiwaliRate());

		System.out.println("Principal is: " + fixedDeposit.getPrincipal()
				+ ", Duration is: " + fixedDeposit.getYears() + " years");
		System.out.println("The interest you will be getting after "
				+ fixedDeposit.getYears() + " years is : "
				+ fixedDeposit.calculateInterest());

	}
}
