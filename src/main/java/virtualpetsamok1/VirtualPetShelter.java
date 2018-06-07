package virtualpetsamok1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> pets = new HashMap<>();

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values(); 
	}

	public Collection<String> returnAllPetsNames() {
		
		Collection<String> names = new ArrayList<>();
		names = pets.keySet();
		return names;

	}

	void feedOrganicPets() {
		OrganicPet.beFed(0);
	}

	void waterOrganicPets() {
		OrganicPet.beWatered(0);
	}

	public void oilRoboticPets() {
		RoboticPet.beOiled(0);
	}

	public void allowPlay() {
		VirtualPet.bePlayedWith(0);
	}

	public void tick() {
		OrganicPet.increaseHunger(0);
		OrganicPet.increaseThirst(0);
		RoboticPet.decreaseOilLevel(0);
	}

	

}
