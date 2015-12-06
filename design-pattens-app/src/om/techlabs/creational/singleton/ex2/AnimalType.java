package om.techlabs.creational.singleton.ex2;

public enum AnimalType {

	HUMAN(true), DOG(true), FROG(false);
	
	private boolean mammal;
	private AnimalType(boolean mammal){
		this.mammal=mammal;
		
	}
	public boolean isMammal() {
		if (this== AnimalType.DOG || this == AnimalType.HUMAN)
			return true;
		else
			return false;

	}

}
