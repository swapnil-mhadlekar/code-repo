package com.techlabs.dip.solution2;

public class XMLErrorLogger implements ILogger {

	@Override
	public void log(Exception ex) {
		System.out.println("Creating xml file.");
		System.out.println(ex.getMessage());
		
	}

}
