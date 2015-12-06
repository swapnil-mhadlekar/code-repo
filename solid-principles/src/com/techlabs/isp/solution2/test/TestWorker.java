package com.techlabs.isp.solution2.test;

import com.techlabs.isp.solution2.IEatable;
import com.techlabs.isp.solution2.IWorkable;
import com.techlabs.isp.solution2.Manager;
import com.techlabs.isp.solution2.Programmer;
import com.techlabs.isp.solution2.Robot;

public class TestWorker {
	public static void main(String[] args) {
		
		WorkTime();
		lunchTime();
		


		// Robot robot=new Robot();
		// robot.work();
		//
		// Manager manager=new Manager();
		// manager.eat();
		// manager.work();
		//
		//
		// Programmer programmer=new Programmer();
		// programmer.eat();
		// programmer.work();

	}

	private static void lunchTime() {
		System.out.println("--------------Lunch Time----------------");
		IEatable worker2 = new Manager();
		worker2.eat();
		worker2 = new Programmer();
		worker2.eat();
	}

	private static void WorkTime() {
		System.out.println("------------Working Hours----------");
		IWorkable worker = new Robot();
		worker.work();
		worker = new Manager();
		worker.work();
		worker = new Programmer();
		worker.work();
		
	}

}
