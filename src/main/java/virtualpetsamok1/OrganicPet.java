package virtualpetsamok1;

public abstract class OrganicPet extends VirtualPet implements Poop {

	protected int petHunger;
	protected int petThirst;
	protected int poopTick;

	public OrganicPet(String name, String description, int health, int happiness, int hunger, int thirst) {
		super(name, description, health, happiness);
		petHunger = hunger;
		petThirst = thirst;
	}	
	
	public void setHunger(int hunger) {
		this.petHunger = hunger;
	}

	public int getHunger() {
		return petHunger;
	}

	public void setThirst(int thirst) {
		this.petThirst = thirst;
	}

	public int getThirst() {
		return petThirst;
	}

	public void beFed() {
		petHunger -= 3;
		poopTick +=1;
	}

	public void beWatered() {
		petThirst -= 2;
	}

	public void increaseHunger() {
		petHunger += 1;
	}

	public void increaseThirst() {
		petThirst += 1;

	}
	
	public void tick() {
		petHunger += 1;
		petThirst += 1;
			
	}

	public abstract void poop();
}
