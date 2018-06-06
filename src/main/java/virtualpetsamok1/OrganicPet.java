package virtualpetsamok1;

public abstract class OrganicPet extends VirtualPet implements Poop{

	public static int cleanliness;
	private int statHunger;
	private int statThirst;

	public void setHunger(int hunger) {
		this.statHunger = hunger;
	}
	
	public int getHunger() {
		return this.statHunger;
	}

	public void setThirst(int thirst) {
		this.statThirst = thirst;
	}

	public int getThirst() {
		return this.statThirst;
			
	}
}
