package com.techlabs.isp.solution1;

public class Programmer implements IWorker {
	@Override
	public void eat() {
		System.out.println("Programmer is eating.");
	}

	@Override
	public void work() {
		System.out.println("Programmer is working.");
	}

}
