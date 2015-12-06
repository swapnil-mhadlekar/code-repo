package com.techlabs.dip.solution1;

public class TaxCalculator {
	private int income;
	private int taxRate;
	private LogType log;

	public TaxCalculator(int income, int taxRate, LogType log) {
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

	public LogType getLog() {
		return log;
	}

	public double calculateTax() {

		try {
			double result = income / taxRate;
			return result;

		} catch (Exception e) {
			if (log == LogType.EmailErrorLogger) {
				EmailErrorLogger email = new EmailErrorLogger();
				email.log(e.getMessage());

			} else {
				if (log == LogType.XMLErroeLogger) {
					XMLErrorLogger xml = new XMLErrorLogger();
					xml.log(e.getMessage());
				}
			}

		}
		return 0;

	}

}
