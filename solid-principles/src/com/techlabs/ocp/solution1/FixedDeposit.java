package com.techlabs.ocp.solution1;

public class FixedDeposit {
	private double principal;
	private int years;
	private FestivalType season;

	public FixedDeposit(double principal, int years, FestivalType season) {
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

	public FestivalType getSeason() {
		return season;
	}

	public double calculateInterest() {

		switch (season) {
		case DIWALI:
			principal = principal * years * 10 / 100;
			break;
		case NEW_YEAR:
			principal = principal * years * 11 / 100;
			break;
		case HOLI:
			principal = principal * years * 12 / 100;
			break;
		case NORMAL:
			principal = principal * years * 8 / 100;
			break;
		}
		return principal;

		// if (season == FestivalType.DIWALI) {
		// principal = principal * years * 10 / 100;
		// } else if (season == FestivalType.HOLI)
		// principal = principal * years * 12 / 100;
		// else if (season == FestivalType.NEW_YEAR)
		// principal = principal * years * 11 / 100;
		// else if (season == FestivalType.NORMAL)
		// principal = principal * years * 8 / 100;
		// return principal;

	}

}
