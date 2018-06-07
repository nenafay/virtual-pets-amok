package virtualpetsamok1;

public abstract class OrganicPet extends VirtualPet implements Poop{

	public static int cleanliness;
	public static int statHunger;
	public static int statThirst;

	public void setHunger(int hunger) {
		OrganicPet.statHunger = hunger;
	}
	
	public static int getHunger() {
		return OrganicPet.statHunger;
	}

	public void setThirst(int thirst) {
		OrganicPet.statThirst = thirst;
	}

	public int getThirst() {
		return OrganicPet.statThirst;
	}

	public static void beFed(int hunger) {
		hunger = hunger -3;	
		
	}

	public static void beWatered(int thirst) {
		thirst = thirst -2;
	}

	public static void increaseHunger(int hunger) {
		hunger = hunger + 1;
	}

	public static void increaseThirst(int thirst) {
		thirst = thirst +1;
	}

	public static boolean wasFed() {
		int hungerBefore = OrganicPet.getHunger();
		OrganicPet.beFed(0);
		int hungerAfter = OrganicPet.getHunger();
		if (hungerBefore > hungerAfter);
		{
		return false;
		}
	}
}
