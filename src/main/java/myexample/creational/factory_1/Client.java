package myexample.creational.factory_1;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = null;
		String speakSound = null;
		animal = animalFactory.getAnimal(AnimalType.dog);
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();

		System.out.println("dog speak : " + speakSound);
		System.out.println();

		animal = animalFactory.getAnimal(AnimalType.duck);
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();

		System.out.println("duck speak : " + speakSound);
		System.out.println();

		animal = animalFactory.getAnimal(AnimalType.lion);
		System.out.println("Animal Type : " + animal.getClass().getName());
		speakSound = animal.speak();

		System.out.println("lion speak : " + speakSound);

	}

}

/*
Animal Type : myexample.creational.factory_1.Dog
dog speak : Bark Bark Bark

Animal Type : myexample.creational.factory_1.Duck
duck speak : Quack Quack Quack

Animal Type : myexample.creational.factory_1.Lion
lion speak : Roar
 */
