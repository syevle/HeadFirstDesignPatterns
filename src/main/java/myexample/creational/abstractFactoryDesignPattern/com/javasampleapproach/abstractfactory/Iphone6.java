package myexample.creational.abstractFactoryDesignPattern.com.javasampleapproach.abstractfactory;


public class Iphone6 implements SmartPhone {
	
	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								,"iPhone 6s", "4.7-inch display");
		return msg;
	}
}
