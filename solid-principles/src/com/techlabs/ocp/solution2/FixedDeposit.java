package com.techlabs.ocp.solution2;

public class FixedDeposit {
	private double principal;
	private int years;
	private IFestiveRate season;

	public FixedDeposit(double principal, int years, IFestiveRate season) {
		this.principal = principal;
		this.years = years;
		this.season = season;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getYears() {
		return years;
	}

	public IFestiveRate getSeason() {
		return season;
	}

	public double calculateInterest() {
		return principal * years * season.getRate();

	}
}