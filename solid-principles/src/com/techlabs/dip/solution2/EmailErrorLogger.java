package com.techlabs.dip.solution2;

public class EmailErrorLogger implements ILogger {

	@Override
	public void log(Exception ex) {
		System.out.println("Emailing is in process.");
		System.out.println(ex.getMessage());
	}

}
