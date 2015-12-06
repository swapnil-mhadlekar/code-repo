package com.techlabs.ocp.solution1.test;

import com.techlabs.ocp.solution1.FestivalType;
import com.techlabs.ocp.solution1.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fixedDposit = new FixedDeposit(100000, 5,
				FestivalType.DIWALI);

		System.out.println("Principal is: " + fixedDposit.getPrincipal()
				+ ", Duration is: " + fixedDposit.getYears() + " years, Season is: "
				+ fixedDposit.getSeason());
		System.out.println("The Interest you will be getting after "
				+ fixedDposit.getYears() + " years is : "
				+ fixedDposit.calculateInterest());
	}

}
