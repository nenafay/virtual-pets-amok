package virtualpetsamok1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import virtualpetsamok1.OrganicCat;
import virtualpetsamok1.OrganicDog;
import virtualpetsamok1.RoboticCat;
import virtualpetsamok1.RoboticDog;
import virtualpetsamok1.VirtualPet;
import virtualpetsamok1.VirtualPetShelter;

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
		testpet3 = new RoboticDog("Dash", "has nano-bot fleas", 0, 0, 0);
		testpet4 = new RoboticCat("Dot", "chases anything that moves", 0, 0, 0);	
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
		assertEquals(testpet1.hunger, 9);
		assertEquals(testpet2.hunger, 8);//Compiler won't let me go to Organic.
	}
	
	@Test
	public void shouldWaterOrganicPets() {
		testpet1.setThirst(10);
		testpet2.setThirst(9);
		underTest.waterAllPets();
		testpet1.getPetThirst();
		testpet2.getPetThirst();
		assertEquals(testpet1.thirst, 8);
		assertEquals(testpet2.thirst, 7);
	}

	@Test
	public void shouldAllowPlayWithOnePet() {
		testpet1.setHappiness(3);
		testpet2.setHappiness(4);
		underTest.allowPlay(testpet1);
		testpet1.getHappiness();
		testpet2.getPetHappiness();
		assertEquals(testpet1.happiness, 1);
		assertEquals(testpet2.happiness,4);
		
	}
	@Test
	public void shouldCallTick() {
		underTest.tick();
		assertThat(testpet1.getPetHunger(), is(1));
		assertThat(testpet1.getPetThirst(), is(1));
		assertThat(testpet1.getPetBoredom(), is(1));
		
	}//everything was working beautifully... until it wasn't. I can't find the error.
}

