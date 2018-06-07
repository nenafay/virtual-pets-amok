package virtualpetsamok1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
		
		Map<String, VirtualPet>pets = new HashMap<>();
		
		underTest = new VirtualPetShelter();
		testpet1 = new OrganicDog("Dinah", "American Bulldog mix, brindle coat", 0, 0, 0, 0, 0);
		testpet2 = new OrganicCat("Andre", "Maine-Coon, long-hair", 0, 0, 0, 0);
		testpet3 = new RoboticDog("Dash", "has nano-bot fleas", 0, 0, 15);
		testpet4 = new RoboticCat("Dot", "chases anything that moves", 0, 0, 15);	
	}
	@Test
	public void shouldAddPetToShelter() {
		VirtualPet foundPet = underTest.findPet(testpet1.getPetName());
		assertThat(foundPet, is("Dinah"));
	}
	
	@Test
	public void shouldAddTwoPetsToShelter() {
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(testpet1, testpet2, testpet3, testpet4));
		
	}
	@Test
	public void allowsAdoption() {
		VirtualPet foundPet = underTest.findPet(testpet3.getPetName());
		assertThat(foundPet, is(nullValue()));
		
	}
	
	@Test
	public void returnsSpecificPetGivenName() {
		String getDescription = testpet2.returnPetDescription();
		assertThat(testpet2.returnPetDescription(), is("Maine-Coon, long-hair"));
		
	}
	
	@Test
	public void shouldReturnCollectionOfPets() {
		Collection<String> allPetNames = underTest.returnAllPetsNames();
		assertThat(allPetNames, containsInAnyOrder("Dinah", "Andre", "Dash", "Dot"));
	}
	
	@Test
	public void shouldFeedOrganicPets() {
		testpet1.setHunger(10);
		testpet2.setHunger(9);
		underTest.feedOrganicPets();
		testpet1.getPetHunger();
		testpet2.getPetHunger();
		assertEquals(testpet1.getHunger(), 9);
		assertEquals(testpet2.getHunger(), 8);//Compiler won't let me go to Organic.
	}
	
	@Test
	public void shouldWaterOrganicPets() {
		testpet1.setThirst(10);
		testpet2.setThirst(9);
		underTest.waterOrganicPets();
		testpet1.getPetThirst();
		testpet2.getPetThirst();
		assertEquals(testpet1.thirst, 8);
		assertEquals(testpet2.thirst, 7);
	}

	@Test
	public void shouldAllowPlayWithOnePet() {
		testpet1.setHappiness(3);
		testpet4.setHappiness(4);
		testpet2.setHappiness(4);
		testpet3.setHappiness(4);
		underTest.allowPlay();
		testpet1.getHappiness();
		testpet2.getHappiness();
		testpet3.getHappiness();
		testpet4.getHappiness();
		assertEquals(testpet1.getHappiness(),1);
		assertEquals(testpet2.getHappiness(),4);		
		
	}
	
	@Test
	public void shouldOilRoboticPets() {
		testpet4.setOilLevel(7);
		testpet3.setOilLevel(3);
		underTest.oilRoboticPets();
		testpet4.getOilLevel();
		testpet3.getOilLevel();
		assertEquals(testpet4.getOilLevel(), 4);
		assertEquals(testpet3.getOilLevel(),0);
	}
	 
	@Test
	public void shouldCallTick() {
		underTest.tick();
		assertThat(testpet1.getHunger(), is(1));
		assertThat(testpet2.getHunger(), is(1));
		assertThat(testpet3.getOilLevel(), is(14));
		assertThat(testpet4.getOilLevel(), is (14));
		assertThat(testpet1.getThirst(), is(1));
		assertThat(testpet2.getThirst(), is(1));
		
	}//everything was working beautifully... until it wasn't. I can't find the error.
}

