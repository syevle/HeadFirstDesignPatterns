package myexample.structural.decorator_4;

public class DecoratorClient {

	public static void main(String[] args) {
		Car bmwCar1 = new BMWCar();
		System.out.println(bmwCar1 + "\n");

		DieselCarDecorator carWithDieselEngine = new DieselCarDecorator(bmwCar1);
		carWithDieselEngine.manufactureCar();

		System.out
				.println("\n*******************************************************");

		Car bmwCar2 = new BMWCar();

		PetrolCarDecorator carWithPetrolEngine = new PetrolCarDecorator(bmwCar2);
		carWithPetrolEngine.manufactureCar();

	}
}
/*
		BMWCar [CARNAME=BMW, carBody=null, carDoor=null, carWheels=null, carGlass=null, engine=null]

		DieselCarDecorator added Diesel Engine to the Car : BMWCar [CARNAME=BMW, carBody=carbon fiber material, carDoor=4 car doors, carWheels=4 MRF wheels, carGlass=6 car glasses, engine=Diesel Engine]

		*******************************************************
		PetrolEngineDecorator added Petrol Engine to the Car : BMWCar [CARNAME=BMW, carBody=carbon fiber material, carDoor=4 car doors, carWheels=4 MRF wheels, carGlass=6 car glasses, engine=Petrol Engine]

*/
