package virtualpetsamok1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.OrganicPet;

public class OrganicTest {
	
	OrganicPet testOrganicDog;

	@Before
	public void setUp() {
	}
	
	@Test
	public void shouldHaveHealth() {
		// act
		testOrganicDog.setHealth(10);
		int health = testOrganicDog.getHealth();

		// assert
		assertEquals(10, health);
	}
	
	@Test
	public void shouldHaveHappiness() {
		testOrganicDog.setPetHappiness(10);
		int happiness = testOrganicDog.getHappiness();
		
		assertEquals(10, happiness);
	}
	
	@Test
	public void shouldHaveHunger() {
		testOrganicDog.setHunger(10);
		int hunger = testOrganicDog.getHunger();
		
		assertEquals(10, hunger);
	}
	
	@Test
	public void shouldHaveThirst() {
		
		testOrganicDog.setThirst(10);
		int hunger = testOrganicDog.getThirst();
		
		assertEquals(10, hunger);
		
	}
	
	@Test
	public void shouldPoopAfter3Feedings() {
		
		
	
		
	}
	

	
	
}
