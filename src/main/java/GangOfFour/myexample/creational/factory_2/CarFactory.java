package GangOfFour.myexample.creational.factory_2;


public class CarFactory {
	public Car produce(CarType type){
		Car car = null;
		switch(type){
			case Mercedes: 
				car = new Mercedes();
				break;
			case Audi:
				car = new Audi();
				break;
			case BMW:
				car = new BMW();
				break;
			default:
				break;
		}
		return car;
	}
}
