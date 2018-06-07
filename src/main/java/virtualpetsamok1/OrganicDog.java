package virtualpetsamok1;

public class OrganicDog extends OrganicPet implements Poop{
	
	private static int happiness;
	private int petCageCleanliness;
	private int petHappiness;
	

	public OrganicDog(String name, String description, int health, int happiness, int hunger, int thirst, int cageCleanliness) {
	}

	public void beWalked() {
		VirtualPet.petHappiness = OrganicDog.happiness+2;	
	}

	public void getPetThirst() {
		// TODO Auto-generated method stub
		
	}

	public void setCageCleanliness(int cageCleanliness) {
		this.petCageCleanliness = cageCleanliness;
	}

	public void goDogsGo() {
		if (Poop.poopTick == 3) {
		Poop.poop();
	}

	public void getCageCleanliness() {
		// TODO Auto-generated method stub
		
	}

	

}
