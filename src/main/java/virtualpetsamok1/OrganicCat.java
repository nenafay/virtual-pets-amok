package virtualpetsamok1;

public class OrganicCat extends OrganicPet implements Poop{
	
	public OrganicCat(String name, String description, int health, int happiness, int hunger, int thirst) {
		// TODO Auto-generated constructor stub
	}

	public void poop(Litterbox litterbox) {
		litterbox.receivePoop();
	}

}