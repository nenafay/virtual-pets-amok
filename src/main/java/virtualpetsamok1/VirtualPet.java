package virtualpetsamok1;

public abstract class VirtualPet implements Comparable<VirtualPet> {

	protected int petHealth;
	protected int petHappiness;
	private String petName;
	private String petDescription;

	public VirtualPet(String name, String description, int health, int happiness) {
		petHealth = health;
		petHappiness = happiness;
		petName = name;
		petDescription = description;
				
	}
	/* Health Methods */
	
	public int getHealth() {
		return this.petHealth;
	}
	
	public void decreasePetHealth(int health) {
		this.petHealth -= health;
	}

	public void setHealth(int health) {
		this.petHealth = health;
			
	}

	/* Happiness Methods */
	
	public int getHappiness() {
		return this.getPetHappiness();
	}
	
	public void decreasePetHappiness(int happiness){
		this.setPetHappiness(this.getPetHappiness() - happiness);
	}
	
	public void setHappiness(int happiness) {
		this.petHappiness = happiness;
	}

	/* Health/Happiness Methods */
	
	public void sadSick() {
		if (this.getPetHappiness() <3) {
			this.petHealth = petHealth -1;
		}		
	
	}

	public String getPetName() {
		return this.petName;
	}

	public String returnPetDescription() {
		return this.petDescription;
	
	}

	public int getPetHappiness() {
		return petHappiness;
	}

	public void setPetHappiness(int happiness) {
		this.petHappiness = happiness;
	}

	public void bePlayedWith() {
		petHappiness += 2; 
	}
	@Override
	public String toString() {
		return this.petName;
	}
	@Override
	public int compareTo(VirtualPet pet) {
		if(this.getPetName().compareTo(pet.getPetName()) < 0) {
			return -1;
		} else if (this.getPetName().compareTo(pet.getPetName()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public abstract void tick();
	//pets implement tick in own way
		
	
}
