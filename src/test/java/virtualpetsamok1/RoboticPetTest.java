package virtualpetsamok1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.RoboticPet;

public class RoboticPetTest {
	RoboticPet testRobotic;
	
	@Before
	public void setUP() {
		testRobotic = new RoboticPet(null, null, 0, 0, 0);
	}

	@Test
	public void shouldHaveHealth() {
		// act
		testRobotic.setHealth(10);
		int health = testRobotic.getHealth();

		// assert
		assertEquals(10, health);

	}
	
	@Test
	public void shouldHaveHappiness() {
		testRobotic.setPetHappiness(10);
		int happiness = testRobotic.getHappiness();
		
		assertEquals(10, happiness);
	}
	
	@Test
	public void shouldNeedOil() {
		testRobotic.setOilLevel(10);
		int oilLevel = testRobotic.getOilLevel();
		
		assertEquals(10, oilLevel);
	}
}