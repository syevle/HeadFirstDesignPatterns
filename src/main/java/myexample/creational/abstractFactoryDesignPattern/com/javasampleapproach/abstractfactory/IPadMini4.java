package myexample.creational.abstractFactoryDesignPattern.com.javasampleapproach.abstractfactory;


public class IPadMini4 implements Tablet {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								, "iPad mini 4", "7.9-inches display");
		return msg;
	}
}
