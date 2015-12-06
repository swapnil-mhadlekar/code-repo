package om.techlabs.creational.singleton.ex2.test;

import java.util.Iterator;

import om.techlabs.creational.singleton.ex2.AnimalType;

public class TestAnimal {

	public static void main(String[] args) {

		// testHashcode();
		// test1();
		test2();

	}

	private static void testHashcode() {
		AnimalType currentAnimal = AnimalType.DOG;
		System.out.println(System.identityHashCode(currentAnimal));
		AnimalType current = AnimalType.FROG;
		System.out.println(System.identityHashCode(current));
		AnimalType dog = AnimalType.DOG;
		System.out.println(System.identityHashCode(dog));
	}

	private static void test2() {
		AnimalType[] animalList = AnimalType.values();
		System.out.println("Animal" + "\t" + "is Mammal??");
		System.out.println("------" + "\t" + "---------");
		for (AnimalType animal : animalList) {
			System.out.println(animal + "\t" + animal.isMammal());
		}

	}

	private static void test1() {
		AnimalType dog = AnimalType.DOG;
		System.out.println(dog.isMammal());
		AnimalType human = AnimalType.HUMAN;
		System.out.println(human.isMammal());
		AnimalType frog = AnimalType.FROG;
		System.out.println(frog.isMammal());
	}

}
