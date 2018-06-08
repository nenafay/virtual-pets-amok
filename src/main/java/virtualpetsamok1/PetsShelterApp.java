package virtualpetsamok1;
import java.util.Scanner;

public class PetsShelterApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter sunnysideShelter = new VirtualPetShelter();
		
		OrganicDog pet1 = new OrganicDog("Betty", "a low-down Bassett Hound", 8, 5, 7, 2, 8);
		RoboticDog pet2 = new RoboticDog("Bitz", "has a few squeaky joints", 6, 9, 4);
		RoboticCat pet3 = new RoboticCat("Fritz", "short circuits every time you scratch his back", 4, 12, 10);
		OrganicCat pet4 = new OrganicCat("Frida", "a small, three-legged tabby", 4, 4, 2, 5);
		OrganicDog pet5 = new OrganicDog("Sal", "a lovable lazy mutt", 7, 9, 8, 4, 4);
		OrganicCat pet6 = new OrganicCat("Pal", "a sweet calico. Likes laser tag.", 8, 9, 7, 9);
		RoboticCat pet7 = new RoboticCat("Hal", "has one eye. Calls you Dave.", 9, 5, 10);
		RoboticDog pet8 = new RoboticDog("Daisy", "likes chasing bicycles.", 10, 10, 10);
		
		System.out.println("Welcome to Sunnyside SpaceStation Pet Shelter and Sanitarium" + "\n"
		+ "Sunnyside is home to a variety of pets, both organic and robotic, sane and less-sane."
		+ "\n" + "Visitors can tend to our pets, adopt a pet, or place a pet in our care." + "\n\n"
		+ "What would you like to do today?" + "\n");
		
//			while (sunnysideShelter.hasPets()) {// need to make test for this in VPSTest
				System.out.println("press 1 to volunteer" +
					"\n" + "press 2 to adopt a pet" +  
					"\n" + "press 3 to place a pet in our care");
				
			int interaction = input.nextInt();			
			if (interaction ==1) {
				System.out.println("Excellent! We love volunteers! \n" + 
				"First, let me show you our pets.");
				//pet stat grid
				System.out.println("Name" + "\t|" + "health" + "\t|" + "happy" + "\t|"
				+ "hunger"+ "\t|" + "thirst" + "\t|" + "clean" + "\t|" + "oil" + "\n");
				System.out.println(pet1.getPetName() + "\t|" + pet1.getHealth() + "\t|" + 
						pet1.getHappiness() + "\t|" + pet1.getHunger() + "\t|" + pet1.getThirst() + "\t|" +
						pet1.getPetCleanliness() + "\t|" + "-");
				System.out.println(pet2.getPetName() + "\t|" + pet2.getHealth() + "\t|" + 
						pet2.getHappiness() + "\t|" + "-" + "\t|" + "-" + "\t|" +
						"-" + "\t|" + pet2.getOilLevel());
				System.out.println(pet3.getPetName() + "\t|" + pet3.getHealth() + "\t|" + 
						pet3.getHappiness() + "\t|" + "-" + "\t|" + "-" + "\t|" +
						"-" + "\t|" + pet3.getOilLevel());
				System.out.println(pet1.getPetName() + "\t|" + pet1.getHealth() + "\t|" + 
						pet4.getHappiness() + "\t|" + pet4.getHunger() + "\t|" + pet4.getThirst() + "\t|" +
						"-"+ "\t|" + "-");
				System.out.println(pet5.getPetName() + "\t|" + pet5.getHealth() + "\t|" + 
						pet5.getHappiness() + "\t|" + pet5.getHunger() + "\t|" + pet5.getThirst() + "\t|" +
						pet5.getPetCleanliness() + "\t|" + "-");
				System.out.println(pet6.getPetName() + "\t|" + pet6.getHealth() + "\t|" + 
						pet6.getHappiness() + "\t|" + pet6.getHunger() + "\t|" + pet6.getThirst() + "\t|" +
						"-" + "\t|" + "-");
				System.out.println(pet7.getPetName() + "\t|" + pet7.getHealth() + "\t|" + 
						pet7.getHappiness() + "\t|" + "-" + "\t|" + "-" + "\t|" +
						"-" + "\t|" + pet7.getOilLevel());
				System.out.println(pet8.getPetName() + "\t|" + pet8.getHealth() + "\t|" + 
						pet6.getHappiness() + "\t|" + "-" + "\t|" + "-" + "\t|" +
						"-" + "\t|" + pet8.getOilLevel());
				// next input section:
				System.out.println("How would you like to help today? \n" +
					"press 1 to feed organic pets" + "\n" +
					"press 2 to water organic pets" + "\n" +
					"press 3 to walk dogs" + "\n"+
					"press 4 to oil robotic pets" + "\n" +
					"press 5 to clean" + "\n" +
					"press 6 to select a pet to play with \n");
				//if-else statement, volunteer options
				int volunteerChoice = input.nextInt();
				sunnysideShelter.tick();
				if (volunteerChoice == 1) {
					sunnysideShelter.feedOrganicPets();
				}else if (volunteerChoice ==2){
					sunnysideShelter.waterOrganicPets();
				}else if (volunteerChoice == 3) {
//					sunnysideShelter.walkDogs();
					//need to make method for walking all the dogs from VPS
				}else if (volunteerChoice == 4) {
					sunnysideShelter.oilRoboticPets();
				}else if (volunteerChoice == 5){
//					System.out.println("The cats' litterbox is " + sunnysideShelter.checkLitterbox() + ".");
					//need to write checkLitterbox method in VPS
//					System.out.println("The dogs' cages are " + sunnysideShelter.checkCageCleanliness() + " .");
					//need to write checkCageCleanliness method in VPS
					System.out.println("To clean the cats' litterbox, please press 1. \n" + 
					"To clean the dogs' cages, please press 2.");
					int cleanChoice = input.nextInt();
					if (cleanChoice == 1 ) {
//						sunnysideShelter.emptyLitterbox();
						//need to write emptyLitterbox method in VPS
						System.out.println("The cats thank you.");
					} else if (cleanChoice == 2) {
//						sunnysideShelter.cleanDogsCages();
						//need to write cleanDogsCages method in VPS
						System.out.println("The dogs are slightly disappointed. They were going to eat that later.");
					}
				}else if (volunteerChoice == 6) {
					System.out.println("The pets are: " + sunnysideShelter.returnAllPetsNames() + ". \n "
							+ "\n Please select a pet by typing its name below.");
					String petChoice = input.nextLine();
					sunnysideShelter.allowPlay(petChoice);
				}
			}else if (interaction == 2) {
				System.out.println("How wonderful!" + "\n" + 
//						"We have" + pets.size() + "pets available for adoption." +
						"They are: " + sunnysideShelter.returnAllPetsNames() + "\n" +
						"\n Please select a pet by typing its name below.");
					String adoptChoice = input.nextLine();
//					sunnysideShelter.adoptPet(adoptChoice);
					//need to check adoptPet method in VPS
			}else if (interaction == 3) {
				System.out.println("We understand that sometimes pet owners have to make these difficult decisions." +
			"\n" + "(And we're not judging you at all.)" + "");
				System.out.println("What is your pet's name?");
				String newPet = input.nextLine();
				System.out.println("We welcome " + newPet + " to Sunnyside!" + "\n" +
				"What kind of pet is " + newPet +"? Please choose from the options below:");
				System.out.println("press 1 for Organic Dog\n" + 
				"press 2 for OrganicCat\n" + 
				"press 3 for Robotic Dog\n" + 
				"press 4 for Robotic Cat");
//				sunnysideShelter.addPet(newPet);
				//need to make this work and put in results for newPet type choice options
			}else {
				System.exit(0);
		}
	}
}
