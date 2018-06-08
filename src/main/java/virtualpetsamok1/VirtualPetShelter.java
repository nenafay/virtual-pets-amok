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
		for (VirtualPet pet : getAllPets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet)pet).beFed();
			}
		}
	}

	void waterOrganicPets() {
		for (VirtualPet pet : getAllPets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet)pet).beWatered();
			}
		}
	}

	public void oilRoboticPets() {
		for (VirtualPet pet : getAllPets()) {
			if(pet instanceof RoboticPet) {
				((RoboticPet)pet).beOiled();
			}
		}
	}
		
	public void allowPlay(String name) {
		pets.get(name).bePlayedWith();
		
	}

	public void tick() {
		for (VirtualPet pet : getAllPets()) {
			pet.tick();
		}
	}
}
