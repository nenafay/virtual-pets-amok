package virtualpetsamok1;

public abstract class VirtualPet {

	private int statHealth;
	private int statHappiness;
	private String petName;
	private String petDescription;

	
	/* Health Methods */
	
	public int getHealth() {
		return this.statHealth;
	}
	
	public void subtractStatHealth(int health) {
		this.statHealth -= health;
	}

	public void setHealth(int health) {
		this.statHealth = health;
			
	}

	/* Happiness Methods */
	
	public void setHappiness(int happiness) {
		this.statHappiness = happiness;
	}

	public int getHappiness() {
		return this.statHappiness;
	}
	
	public void subtractStatHappiness(int happiness){
		this.statHappiness -= happiness;
	}

	/* Health/Happiness Methods */
	
	public void sadSick() {
		if (this.statHappiness <3) {
			this.statHealth = statHealth -1;
		}		
	
	}

	public String getPetName() {
		return this.petName;
	}

	public String returnPetDescription() {
		return this.petDescription;
	
	}
	
}
