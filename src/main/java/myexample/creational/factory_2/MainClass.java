package myexample.creational.factory_2;

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