
package com.MVC;

/**
 *
 * @author Robert Palmer
 */
public class AnimalMain {

	public static void main(String[] args) {
		
		// Get data from the database
		Animal model = retrieveAnimalFromDatabase();
		
		// View to write data on the console
		AnimalView view = new AnimalView();
		
		AnimalController controller = new AnimalController(model, view);
		
		// Update the model data
		controller.setAnimalName("Wilbur");
		controller.setAnimalType("Fido");
		controller.setAnimalDogTagId("199");
		
		controller.updateView();	

	}
	
	// This is my own small database to pull from
	private static Animal retrieveAnimalFromDatabase() {
		Animal animal = new Animal();
		animal.setType("Pitbull");
		animal.setName("Blacky");
		animal.setDogTagId("123");
		return animal;
	}

}
