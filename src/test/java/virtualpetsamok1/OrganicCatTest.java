package virtualpetsamok1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.OrganicCat;

public class OrganicCatTest {
	
	OrganicCat testOrganicCat1;
	OrganicCat testOrganicCat2;

	@Before
	public void setUp() {
		testOrganicCat1 = new OrganicCat(null, null, 0, 0, 0, 0);
		testOrganicCat2 = new OrganicCat(null, null, 0, 0, 0, 0);
	}
	
	@Test
	public void shouldHaveHealth() {
		// act
		testOrganicCat1.setHealth(10);
		int health = testOrganicCat1.getHealth();

		// assert
		assertEquals(10, health);

	}
	
	@Test
	public void shouldHaveHappiness() {
		testOrganicCat1.setPetHappiness(10);
		int happiness = testOrganicCat1.getHappiness();
		assertEquals(10, happiness);
	}
	
	@Test
	public void shouldHaveHunger() {
		testOrganicCat1.setHunger(10);
		int hunger = testOrganicCat1.getHunger();
		assertEquals(10, hunger);
	}
	
	@Test
	public void shouldHaveThirst() {
		testOrganicCat1.setThirst(10);
		int thirst = testOrganicCat1.getThirst();
		assertEquals(10, thirst);
		
	}
	
	@Test
	public void shouldPoopInLitterBox() {
		testOrganicCat1.setLitterboxLevel(5);
		testOrganicCat1.poopTick=3;
		testOrganicCat1.catPoop();
		int litterboxLevel = testOrganicCat1.getLitterboxLevel();
		assertEquals(litterboxLevel, 6);
		
	}
	@Test
	public void shouldLoseVitalStatsIfLitterBoxLevelHits15() {
		testOrganicCat1.setLitterboxLevel(15);
		testOrganicCat1.setHealth(15);
		testOrganicCat1. dirtyDamage();
		int health = testOrganicCat1.getHealth();
		assertEquals(health, 14);
	
	}
}
