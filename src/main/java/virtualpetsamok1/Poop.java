package virtualpetsamok1;

public interface Poop {
		
	public static void poop () { 
		int poop = OrganicPet.cleanliness-1;
	}
	
	public static int poopTick() {
		if (OrganicPet.beFed(0)) {
			poopTick = poopTick +1;	
		}
	}
}