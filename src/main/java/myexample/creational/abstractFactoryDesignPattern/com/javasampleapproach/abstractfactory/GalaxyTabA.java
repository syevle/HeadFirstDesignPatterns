package myexample.creational.abstractFactoryDesignPattern.com.javasampleapproach.abstractfactory;


public class GalaxyTabA implements Tablet {
	
	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								, "Galaxy Tab A", "9.7-inches display");
		return msg;
	}
}
