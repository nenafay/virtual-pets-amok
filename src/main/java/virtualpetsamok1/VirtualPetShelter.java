package virtualpetsamok1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.wcci.virtual_pet_shelter.VirtualPet;

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

	public void feedOrganicPets() {
		for(OrganicPet pets:getAllOrganicPets()) {//need to understand iterables to fix this
			pets.beFed();
		}
	}

	private Object getAllOrganicPets() {
		return pets.values();
	}
	

}
