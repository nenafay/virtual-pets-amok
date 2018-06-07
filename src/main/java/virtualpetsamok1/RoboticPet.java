package virtualpetsamok1;

public class RoboticPet extends VirtualPet{

	private static int oilLevel;
	private int statOilLevel;
	
	public void setOilLevel(int oilLevel) {
		this.statOilLevel = oilLevel;
	}

	public int getOilLevel() {
		return this.statOilLevel;
	}

	public static void beOiled(int oilLevel) {
		oilLevel = oilLevel+3;
	}

	public static void decreaseOilLevel(int i) {
		oilLevel = oilLevel-1;
	}

	
}
