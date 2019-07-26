package GangOfFour.myexample.creational.abstract_factory_1;


public class Iphone6Plus implements SmartPhone {
	
	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								,"iPhone 6s Plus", "5.5-inch display");
		return msg;
	}
}
