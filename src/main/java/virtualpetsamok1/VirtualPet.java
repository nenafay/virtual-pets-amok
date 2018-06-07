package virtualpetsamok1;

public abstract class VirtualPet {

	private int petHealth;
	protected static int petHappiness;
	private String petName;
	private String petDescription;

	
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
	
	public void setHappiness(int happiness) {
		this.setPetHappiness(happiness);
	}

	public int getHappiness() {
		return this.getPetHappiness();
	}
	
	public void decreasePetHappiness(int happiness){
		this.setPetHappiness(this.getPetHappiness() - happiness);
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

	public static void bePlayedWith(int happiness) {
		happiness = happiness + 2; 
	}
	
}
