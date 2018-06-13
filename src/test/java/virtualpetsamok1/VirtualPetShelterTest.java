package virtualpetsamok1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

// Most of these were passing, but now they're not. I have no idea why.
public class VirtualPetShelterTest {
	VirtualPetShelter underTest;
	OrganicDog testpet1;
	OrganicCat testpet2;
	RoboticDog testpet3;
	RoboticCat testpet4;
	
	@Before
	public void setup() {
		
		underTest = new VirtualPetShelter();
		testpet1 = new OrganicDog("Dinah", "American Bulldog mix, brindle coat", 0, 0, 0, 0, 0);
		testpet2 = new OrganicCat("Andre", "Maine-Coon, long-hair", 0, 0, 0, 0);
		testpet3 = new RoboticDog("Dash", "has nano-bot fleas", 0, 0, 15);
		testpet4 = new RoboticCat("Dot", "chases anything that moves", 0, 0, 15);	
	}
	@Test
	public void shouldAddPetToShelter() {
		underTest.addPet(testpet1);
		VirtualPet foundPet = underTest.findPet(testpet1.getPetName());
		assertThat(foundPet, is(testpet1));
	}
	
	@Test
	public void shouldAddTwoPetsToShelter() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		
	}
	@Test
	public void allowsAdoption() {
		underTest.addPet(testpet3);
		underTest.adoptPet(testpet3.getPetName());
		assertThat(underTest.findPet(testpet3.getPetName()), is(nullValue()));
		
	}
	
	@Test
	public void returnsSpecificPetGivenName() {
		underTest.addPet(testpet2);
		testpet2.returnPetDescription();
		assertThat(testpet2.returnPetDescription(), is("Maine-Coon, long-hair"));
		
	}
	
	@Test
	public void shouldReturnCollectionOfPets() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		underTest.addPet(testpet3);
		underTest.addPet(testpet4);
		Collection<String> allPetNames = underTest.returnAllPetsNames();
		assertThat(allPetNames, containsInAnyOrder("Dinah", "Andre", "Dash", "Dot"));
	}
	
	@Test
	public void shouldFeedOrganicPets() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		testpet1.setHunger(10);
		testpet2.setHunger(9);
		underTest.feedOrganicPets();
		testpet1.getHunger();
		testpet2.getHunger();
		assertEquals(testpet1.getHunger(), 7);
		assertEquals(testpet2.getHunger(), 6); 
	}
	
	@Test
	public void shouldWaterOrganicPets() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		testpet1.setThirst(10);
		testpet2.setThirst(9);
		underTest.waterOrganicPets();
		testpet1.getThirst();
		testpet2.getThirst();
		assertEquals(testpet1.getThirst(), 8);
		assertEquals(testpet2.getThirst(), 7);
	}

	@Test
	public void shouldAllowPlayWithOnePet() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		testpet1.setHappiness(3);
		testpet2.setHappiness(4);
		underTest.allowPlay(testpet1.getPetName());
		testpet1.getHappiness();
		testpet2.getHappiness();
		assertEquals(testpet1.getHappiness(),5);
		assertEquals(testpet2.getHappiness(),4);		
		
	}
	
	@Test
	public void shouldOilRoboticPets() {
		underTest.addPet(testpet3);
		testpet3.setOilLevel(3);
		underTest.oilRoboticPets();
		testpet4.getOilLevel();
		testpet3.getOilLevel();
		assertEquals(testpet3.getOilLevel(),6);
	}
	 
	@Test
	public void shouldCallTick() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		underTest.addPet(testpet3);
		underTest.addPet(testpet4);
		underTest.tick();
		assertThat(testpet1.getHunger(), is(1));
		assertThat(testpet2.getHunger(), is(1));
		assertThat(testpet3.getOilLevel(), is(14));
		assertThat(testpet4.getOilLevel(), is (14));
		assertThat(testpet1.getThirst(), is(1));
		assertThat(testpet2.getThirst(), is(1));
		
	} 
}

