package om.techlabs.creational.singleton.ex1;

public class Manager {
	private static Manager manager;

	private Manager() {
		System.out.println("Manager Is Created.");
	}

	public static Manager getManager() {
		if (manager == null) {
			manager = new Manager();
		}
		return manager;

	}

}
