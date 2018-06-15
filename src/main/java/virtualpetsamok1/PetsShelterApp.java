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

		sunnysideShelter.addPet(pet1);
		sunnysideShelter.addPet(pet2);
		sunnysideShelter.addPet(pet3);
		sunnysideShelter.addPet(pet4);
		sunnysideShelter.addPet(pet5);
		sunnysideShelter.addPet(pet6);
		sunnysideShelter.addPet(pet7);
		sunnysideShelter.addPet(pet8);
		
		System.out.println("Welcome to Sunnyside SpaceStation Pet Shelter and Sanitarium" + "\n"
		+ "Sunnyside is home to a variety of pets, both organic and robotic, sane and less-sane."
		+ "\n" + "Visitors can tend to our pets, adopt a pet, or place a pet in our care." + "\n\n"
		+ "What would you like to do today?" + "\n");
		
			while (sunnysideShelter.hasPets()) {	
			System.out.println("press 1 to volunteer" +
					"\n" + "press 2 to adopt a pet" +  
					"\n" + "press 3 to place a pet in our care" +
					"\n" + "press 4 to exit.");
				
			int interaction = input.nextInt();			
			if (interaction ==1) {
				System.out.println("Excellent! We love volunteers! \n" + 
				"First, let me show you our pets.");
				
				//pet stat grid
				
				System.out.println("Name" + "\t|" + "health" + "\t|" + "happy" + "\t|"
						+ "hunger"+ "\t|" + "thirst" + "\t|" + "clean" + "\t|" + "oil" + "\n");
				
				for (VirtualPet pet : sunnysideShelter.getAllPets()) {
					
					String TAB = "\t|";
					String EMPTY_CELL = "-";
					
					String petName = pet.getPetName();
					int petHealth = pet.getHealth();
					int petHappiness = pet.getHappiness();

					String output = petName + TAB + petHealth + TAB + petHappiness + TAB;
					
					if (pet instanceof OrganicPet) {
						output += ((OrganicPet) pet).getHunger() + TAB;
						output += ((OrganicPet) pet).getThirst() + TAB;
						
						if (pet instanceof OrganicDog) {
							output += ((OrganicDog) pet).getPetCleanliness();
						} else {
							output += EMPTY_CELL;
						}
						output += EMPTY_CELL + TAB;
					} else {
						output +=
							EMPTY_CELL + TAB +
							EMPTY_CELL + TAB +
							EMPTY_CELL + TAB +
							((RoboticPet) pet).getOilLevel();
					}
					
					System.out.println(output);
				}
				
				
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
					sunnysideShelter.walkAllDogs();
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
						"We have" + sunnysideShelter.hasNumPets() + "pets available for adoption." +
						"They are: " + sunnysideShelter.returnAllPetsNames() + "\n" +
						"\n Please select a pet by typing its name below.");
					String adoptChoice = input.nextLine();
					sunnysideShelter.adoptPet(adoptChoice);
					
			}else if (interaction == 3) {
				System.out.println("We understand that sometimes pet owners have to make these difficult decisions." +
			"\n" + "(And we're not judging you at all.)" + "");
				System.out.println("What is your pet's name?");
				String newPetName = input.nextLine();
				System.out.println("We welcome " + newPetName + " to Sunnyside!" + "\n" +
				"What kind of pet is " + newPetName +"? Please choose from the options below:");
				System.out.println("press 1 for Organic Dog\n" + 
				"press 2 for OrganicCat\n" + 
				"press 3 for Robotic Dog\n" + 
				"press 4 for Robotic Cat");
				int newPetType = input.nextInt();
				if (newPetType == 1) {
					OrganicDog newOrgDog = new OrganicDog(newPetName, "is a good boy", 10, 10, 0, 0, 10);
					sunnysideShelter.addPet(newOrgDog);
				} else if (newPetType == 2) {
					OrganicCat newOrgCat = new OrganicCat(newPetName, "stares at you with contempt, ", 10, 10, 0, 0);
					sunnysideShelter.addPet(newOrgCat);
				} else if (newPetType == 3) {
					RoboticDog newRoboDog = new RoboticDog(newPetName, "emits sparks from time to time", 10, 10 ,10);
					sunnysideShelter.addPet(newRoboDog);
				} else if (newPetType ==4) {
					RoboticCat newRoboCat = new RoboticCat(newPetName, "comes with its own laser-pointer", 10, 10, 10);
					sunnysideShelter.addPet(newRoboCat);
				}
			}else if (interaction == 4){
				System.out.println("Thanks for stopping by! Goodbye!");
				System.exit(0);
			}
		} {System.out.println("It looks like all our pets have been adopted. What a glorious day!");
		System.out.println("If you have a pet to place in our care, please press 1. Otherwise press 9 to exit.");
		int careChoice = input.nextInt();
		if (careChoice ==1) {
			}				System.out.println("We understand that sometimes pet owners have to make these difficult decisions." +
					"\n" + "(And we're not judging you at all.)" + "");
			System.out.println("What is your pet's name?");
			String newPetName = input.nextLine();
			System.out.println("We welcome " + newPetName + " to Sunnyside!" + "\n" +
			"What kind of pet is " + newPetName +"? Please choose from the options below:");
			System.out.println("press 1 for Organic Dog\n" + 
			"press 2 for OrganicCat\n" + 
			"press 3 for Robotic Dog\n" + 
			"press 4 for Robotic Cat");
			int newPetType = input.nextInt();
			if (newPetType == 1) {
				OrganicDog newOrgDog = new OrganicDog(newPetName, "is a good boy", 10, 10, 0, 0, 10);
				sunnysideShelter.addPet(newOrgDog);
			} else if (newPetType == 2) {
				OrganicCat newOrgCat = new OrganicCat(newPetName, "stares at you with contempt, ", 10, 10, 0, 0);
				sunnysideShelter.addPet(newOrgCat);
			} else if (newPetType == 3) {
				RoboticDog newRoboDog = new RoboticDog(newPetName, "emits sparks from time to time", 10, 10 ,10);
				sunnysideShelter.addPet(newRoboDog);
			} else if (newPetType ==4) {
				RoboticCat newRoboCat = new RoboticCat(newPetName, "comes with its own laser-pointer", 10, 10, 10);
				sunnysideShelter.addPet(newRoboCat);
		} else if (careChoice ==9) {
			System.out.println("Thanks for stopping by! Goodbye!");
			System.exit(0);
			}
		}
	}
}

