package myexample.creational.abstractFactoryDesignPattern.com.javasampleapproach.abstractfactory;


public class GalaxyOn7 implements SmartPhone {
	
	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								, "Samsung Galary On7", "5.5-inches display");
		return msg;
	}
}
