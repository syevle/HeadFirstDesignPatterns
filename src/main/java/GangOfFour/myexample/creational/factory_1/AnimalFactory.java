package GangOfFour.myexample.creational.factory_1;

public class AnimalFactory {
//	public Animal getAnimal(String animalType) {
//		Animal animal = null;
//		if ("dog".equals(animalType)) {
//			animal = new Dog();
//		} else if ("duck".equals(animalType)) {
//			animal = new Duck();
//		} else if ("lion".equals(animalType)) {
//			animal = new Lion();
//		}
//		return animal;
//	}

	public Animal getAnimal(AnimalType type){
		Animal animal = null;
		switch(type){
			case dog:
				animal = new Dog();
				break;
			case duck:
				animal = new Duck();
				break;
			case lion:
				animal = new Lion();
				break;
			default:
				break;
		}
		return animal;
	}
}
