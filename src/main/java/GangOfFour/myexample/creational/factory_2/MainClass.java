package GangOfFour.myexample.creational.factory_2;

import java.util.ArrayList;
import java.util.List;


public class MainClass {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		CarFactory carFactory = new CarFactory();
		cars.add(carFactory.produce(CarType.Mercedes));
		cars.add(carFactory.produce(CarType.Audi));
		cars.add(carFactory.produce(CarType.BMW));
		
		for(Car c: cars){
			System.out.println(c.info());
		}
	}
}
/*
Hello World! I'm a new Mercedes. My Id = 958724017
Hello World! I'm a new Audi. My Id = -35194834
Hello World! I'm a new BMW. My Id = -1245692273
 */