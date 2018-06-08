package virtualpetsamok1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.OrganicDog;

public class OrganicDogTest {
	
	OrganicDog testOrgDog1;
	OrganicDog testOrgDog2;
	private Object cleanliness;
	

	@Before
	public void setUp() {
		testOrgDog1 = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		testOrgDog2 = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		
	}

	@Test
	public void shouldHaveHealth() {
		// act
		testOrgDog1.setHealth(10);
		int health = testOrgDog1.getHealth();

		// assert
		assertEquals(10, health);
	}
	
	@Test
	public void shouldHaveHunger() {
		testOrgDog1.setHunger(10);
		int hunger = testOrgDog1.getHunger();
		assertEquals(10, hunger);
	}
	
	@Test
	public void shouldHaveThirst() {
		testOrgDog1.setThirst(10);
		int hunger = testOrgDog1.getThirst();
		assertEquals(10, hunger);
		
	}
	
	@Test
	public void shouldHaveHappiness() {
		testOrgDog1.setPetHappiness(10);
		int happiness = testOrgDog1.getHappiness();
		assertEquals(10, happiness);
	}

	@Test
	public void walkiesMakeDogHappy() {
		testOrgDog1.setPetHappiness(4);
		testOrgDog1.beWalked();
		int happiness = testOrgDog1.getHappiness();
		assertEquals(happiness, 6);
		
	}
	@Test
	public void dirtiesCageWhenPoops() {
		testOrgDog1.setPetCleanliness(4);
		testOrgDog1.goDogsGo();
		testOrgDog1.beFed();
		testOrgDog1.beFed();
		testOrgDog1.beFed();
		testOrgDog1.getPetCleanliness();
		assertEquals(cleanliness, 3);
	}
}
