package virtualpetsamok1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.OrganicDog;
import virtualpetsamok1.VirtualPet;

public class VirtualPetTest {

	VirtualPet testPet;

	@Before
	public void setUp() {
		testPet = new OrganicDog(null, null, 0, 0, 0, 0, 0);
	}
	@Test
	public void shouldHaveHealth() {
		// act
		testPet.setHealth(10);
		int health = testPet.getHealth();

		// assert
		assertEquals(10, health);

	}
	
	@Test
	public void shouldHaveHappiness() {
		testPet.setHappiness(10);
		int happiness = testPet.getHappiness();
		
		assertEquals(10, happiness);
	}
	
	@Test
	public void shouldLoseHealthIfHappinessTooLow() {
		int testHealthBefore = testPet.getHealth();
		testPet.sadSick();
		int testHealthAfter = testPet.getHealth();
		
		assertEquals(testHealthBefore -1, testHealthAfter);
		
	}

}
