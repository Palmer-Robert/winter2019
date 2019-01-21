
package com.MVC;

/**
 *
 * @author Robert Palmer
 */
public class AnimalController {
	private Animal model;
	private AnimalView view;
	
	public AnimalController(Animal model, AnimalView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setAnimalName(String name) {
		model.setName(name);
	}
	
	public String getAnimalName() {
		return model.getName();
	}
	
	public void setAnimalDogTagId(String dogTagId) {
		model.setDogTagId(dogTagId);
	}
	
	public String getAnimalDogTagId() {
		return model.getDogTagId();
	}
	
	public void setAnimalType(String type) {
		model.setType(type);
	}
	
	public String getAnimalType() {
		return model.getType();
	}
	
	public void updateView() {
		view.printAnimalDetails(model.getName(), model.getType(), model.getDogTagId());
	}
}
