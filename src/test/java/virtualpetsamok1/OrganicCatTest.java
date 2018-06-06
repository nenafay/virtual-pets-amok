package virtualpetsamok1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.Litterbox;
import virtualpetsamok1.OrganicCat;

public class OrganicCatTest {
	
	OrganicCat testOrganicCat1;
	OrganicCat testOrganicCat2;
	Litterbox testLitter;

	@Before
	public void setUp() {
		testOrganicCat1 = new OrganicCat(null, null, 0, 0, 0, 0);
		testOrganicCat2 = new OrganicCat(null, null, 0, 0, 0, 0);
		testLitter = new Litterbox();
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
		testOrganicCat1.setHappiness(10);
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
		int hunger = testOrganicCat1.getThirst();
		
		assertEquals(10, hunger);
		
	}
	
	@Test
	public void shouldPoopInLitterBox() {
		int litterCleanlinessBefore = testLitter.getLitterboxCleanliness();
		testOrganicCat1.poop(testLitter);
		int litterCleanlinessAfter = testLitter.getLitterboxCleanliness();
		
		assertEquals(litterCleanlinessBefore -1, litterCleanlinessAfter);
		
	}
	@Test
	public void shouldLoseHealthIfLitterBoxCleanlinessIs0() {
		testLitter.setStatCleanliness(0);
		testOrganicCat1.setHealth(15);
		testLitter.dirtyDamage(testOrganicCat1);
		int health = testOrganicCat1.getHealth();
		assertEquals(health, 14);
	
	}
}
