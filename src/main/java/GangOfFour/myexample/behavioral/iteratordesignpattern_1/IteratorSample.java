package GangOfFour.myexample.behavioral.iteratordesignpattern_1;

public class IteratorSample {
	public static void main(String args[]) {
		ZooImpl zoo = new ZooImpl();
		zoo.addAnimal(new Animal("Tiger", "Wild"));
		zoo.addAnimal(new Animal("Lion", "Wild"));
		zoo.addAnimal(new Animal("Tom Cat", "Domestic"));
		zoo.addAnimal(new Animal("Raging Bull", "Wild"));
		zoo.addAnimal(new Animal("Scooby Doo", "Domestic"));

		Iterator wildIterator = zoo.createIterator("Wild");
		while (!wildIterator.isLastAnimal()) {
			System.out.println("Wild Animal: "
					+ wildIterator.nextAnimal().getAnimalName());
		}

		Iterator domesticIterator = zoo.createIterator("Domestic");
		while (!domesticIterator.isLastAnimal()) {
			System.out.println("Domestic Animal: "
					+ domesticIterator.nextAnimal().getAnimalName());
		}
	}
}

/*========================== OutPut ============================
Wild Animal: Tiger
Wild Animal: Lion
Wild Animal: Raging Bull
Domestic Animal: Tom Cat
Domestic Animal: Scooby Doo


 */