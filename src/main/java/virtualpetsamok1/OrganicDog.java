package virtualpetsamok1;

public class OrganicDog extends OrganicPet implements Poop {
	public int poopTick;
	public int petCleanliness;
	public int poop;

	public OrganicDog(String name, String description, int health, int happiness, int hunger, int thirst, int cleanliness) {
	super(name, description, health, happiness, hunger, thirst);
		petCleanliness = cleanliness;
	}

	public void beWalked() {
		petHappiness += 2;
		poopTick = 1;//when dog is created, set pooptick to 1. When walked, return to 1.
	}

	public void getPetThirst() {

	}

	public void goDogsGo() {
		if (this.poopTick() % 3 == 0) {
			this.poop();
		}
		petCleanliness -= 1;

	}

	public int getPetCleanliness() {
		return petCleanliness;
	}

	public void setPetCleanliness(int petCleanliness) {
		this.petCleanliness = petCleanliness;
	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int poopTick() {
		return ++poopTick ;
	}

}
