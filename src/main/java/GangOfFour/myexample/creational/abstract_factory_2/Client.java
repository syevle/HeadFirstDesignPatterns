package GangOfFour.myexample.creational.abstract_factory_2;

public class Client {

	public static void main(String[] args) {
		Animal animal = null;
		AnimalFactory animalFactory = null;
		String speakSound = null;

		// Get Factory object by passing the factory type
		animalFactory = AnimalFactory.getAnimalFacory("sea");

		System.out.println("Animal Factory type : "
				+ animalFactory.getClass().getName());
		System.out.println();

		// Get Animal object by passing the animal type
		animal = animalFactory.getAnimal("shark");
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();
		System.out.println("shark speak : " + speakSound);
		System.out.println();

		animal = animalFactory.getAnimal("octopus");
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();
		System.out.println("octopus speak : " + speakSound);

		System.out
				.println("---------------------------------------------------------");
		// Get Factory by passing the factory type
		animalFactory = AnimalFactory.getAnimalFacory("land");

		System.out.println("Animal Factory type : "
				+ animalFactory.getClass().getName());
		System.out.println();

		// Get Animal object by passing the animal type
		animal = animalFactory.getAnimal("dog");
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();
		System.out.println("dog speak : " + speakSound);
		System.out.println();

		animal = animalFactory.getAnimal("cat");
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();
		System.out.println("cat speak : " + speakSound);

		System.out.println();
		animal = animalFactory.getAnimal("lion");
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();
		System.out.println("lion speak : " + speakSound);

	}
}


/*
Animal Factory type : GangOfFour.myexample.creational.abstract_factory_2.SeaAnimalFactory

Animal Type : GangOfFour.myexample.creational.abstract_factory_2.Shark
shark speak : Cannot Speak

Animal Type : GangOfFour.myexample.creational.abstract_factory_2.Octopus
octopus speak : SQUAWCK
---------------------------------------------------------
Animal Factory type : GangOfFour.myexample.creational.abstract_factory_2.LandAnimalFactory

Animal Type : GangOfFour.myexample.creational.abstract_factory_2.Dog
dog speak : Bark Bark Bark

Animal Type : GangOfFour.myexample.creational.abstract_factory_2.Cat
cat speak : Meow Meow Meow

Animal Type : GangOfFour.myexample.creational.abstract_factory_2.Lion
lion speak : Roar

 */