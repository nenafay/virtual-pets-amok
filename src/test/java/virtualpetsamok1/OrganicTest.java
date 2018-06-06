package virtualpetsamok1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.OrganicPet;

public class OrganicTest {
	
	OrganicPet testOrganic;

	@Before
	public void setUp() {
	}
	
	@Test
	public void shouldHaveHealth() {
		// act
		testOrganic.setHealth(10);
		int health = testOrganic.getHealth();

		// assert
		assertEquals(10, health);
	}
	
	@Test
	public void shouldHaveHappiness() {
		testOrganic.setHappiness(10);
		int happiness = testOrganic.getHappiness();
		
		assertEquals(10, happiness);
	}
	
	@Test
	public void shouldHaveHunger() {
		testOrganic.setHunger(10);
		int hunger = testOrganic.getHunger();
		
		assertEquals(10, hunger);
	}
	
	@Test
	public void shouldHaveThirst() {
		
		testOrganic.setThirst(10);
		int hunger = testOrganic.getThirst();
		
		assertEquals(10, hunger);
		
	}
	
	@Test
	public void shouldPoopAfter3Feedings() {
		testOrganic.poopTick();
		testOrganic.
		
	}
	

	
	
}
