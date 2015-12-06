package com.techlabs.dip.solution2;

public class TaxCalculator {
	private int income;
	private int taxRate;
	private ILogger log;

	public TaxCalculator(int income, int taxRate, ILogger log) {
		this.income = income;
		this.taxRate = taxRate;
		this.log = log;
	}

	public int getIncome() {
		return income;
	}

	public int getTaxRate() {
		return taxRate;
	}

	public ILogger getLog() {
		return log;
	}

	public double calculateTax() {

		try {
			double result = income / taxRate;
			return result;

		} catch (Exception e) {
			log.log(e);
			throw e;
		}

	}

}
