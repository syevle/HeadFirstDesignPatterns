package GangOfFour.myexample.creational.builder_2;

public class BuilderClient {

	public static void main(String[] args) throws Exception {
		AnimalToy lionToy = ToyMaker.makeToy(ToyMaker.LION_TOY);
		System.out.println(lionToy);
		AnimalToy dogToy = ToyMaker.makeToy(ToyMaker.DOG_TOY);
		System.out.println(dogToy);
		AnimalToy monkeyToy = ToyMaker.makeToy(ToyMaker.MONKEY_TOY);
		System.out.println(monkeyToy);

	}

}

/*
Step 1 : Lion Head has been built
Step 2 : Lion Body has been built
Step 3 : Lion Legs has been built
Step 4 : is skiped because Lion doesn't have Arms
Step 5 : Lion Tail has been built
AnimalToy [animalToyName=Lion, animalToyHead=Lion head, animalToyBody=Lion Body, animalToyArms=null, animalToyLegs=No arms, animalToyTail=Lion Tail]

Step 1 : Dog Head has been built
Step 2 : Dog Body has been built
Step 3 : Dog Legs has been built
Step 4 : is skiped because dog doesn't have Arms
Step 5 : Dog Tail has been built
AnimalToy [animalToyName=Dog, animalToyHead=Dog head, animalToyBody=Dog Body, animalToyArms=null, animalToyLegs=No arms, animalToyTail=Dog Tail]

Step 1 : Monkey Head has been built
Step 2 : Monkey Body has been built
Step 3 : Monkey Legs has been built
Step 4 : Monkey Arms has been built
Step 5 : Monkey Tail has been built
AnimalToy [animalToyName=Monkey, animalToyHead=Monkey head, animalToyBody=Monkey Body, animalToyArms=Monkey 2 Arms, animalToyLegs=Monkey 2 legs, animalToyTail=Monkey Tail]


 */