package virtualpetsamok1;

public class OrganicCat extends OrganicPet implements Poop{
	
	private int litterboxLevel;

	public OrganicCat(String name, String description, int health, int happiness, int hunger, int thirst) {
		super(name, description, health, happiness, hunger, thirst);
	}
	public int setLitterboxLevel(int litterboxLevel) {
		return litterboxLevel;
	}

	public int getLitterboxLevel() {
		return litterboxLevel;
	}

	public void catPoop() {
		if (poopTick()%3 == 0);	
		litterboxLevel += 1;
	}

	@Override
	public int poopTick() {
		return 0;
	}

	@Override
	public void poop() {
	}
	public void dirtyDamage() {
		if (litterboxLevel >=15) {
		this.petHealth -= 1;
		this.petHappiness -= 1;
		}
		
	}

	
}
