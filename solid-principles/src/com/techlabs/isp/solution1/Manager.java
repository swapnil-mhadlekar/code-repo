package com.techlabs.isp.solution1;

public class Manager implements IWorker {
	@Override
	public void eat() {
		System.out.println("Manager is eating. ");
	}

	@Override
	public void work() {
		System.out.println("Manager is working.");
	}

}
