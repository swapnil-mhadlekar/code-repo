package om.techlabs.creational.singleton.ex1.test;

import om.techlabs.creational.singleton.ex1.Manager;

public class TestManager {

	public static void main(String[] args) {
		Manager manager1 = Manager.getManager();
		Manager manager2 = Manager.getManager();
		System.out.println(System.identityHashCode(manager1));
		System.out.println(System.identityHashCode(manager2));
	}

}
