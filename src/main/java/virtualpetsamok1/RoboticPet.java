package virtualpetsamok1;

public class RoboticPet extends VirtualPet{
	
	private int petOilLevel;

	public RoboticPet(String name, String description, int health, int happiness, int oilLevel) {
		super(name, description, health, happiness);
		
		petOilLevel = oilLevel;
	}
	
	public void setOilLevel(int oilLevel) {
		this.petOilLevel = oilLevel;
	}

	public int getOilLevel() {
		return this.petOilLevel;
	}

	public void beOiled() {
		petOilLevel += 3;
	}

	public void decreaseOilLevel() {
		petOilLevel -= 1;
	}
	
	public void tick() {
		petOilLevel -= 1;
	}

	
}
