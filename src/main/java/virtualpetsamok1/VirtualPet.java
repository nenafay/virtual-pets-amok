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
		this.setStatHappiness(happiness);
	}

	public int getHappiness() {
		return this.getStatHappiness();
	}
	
	public void subtractStatHappiness(int happiness){
		this.setStatHappiness(this.getStatHappiness() - happiness);
	}

	/* Health/Happiness Methods */
	
	public void sadSick() {
		if (this.getStatHappiness() <3) {
			this.statHealth = statHealth -1;
		}		
	
	}

	public String getPetName() {
		return this.petName;
	}

	public String returnPetDescription() {
		return this.petDescription;
	
	}

	public int getStatHappiness() {
		return statHappiness;
	}

	public void setStatHappiness(int statHappiness) {
		this.statHappiness = statHappiness;
	}

	public static void bePlayedWith(int happiness) {
		happiness = happiness + 2; 
	}
	
}
