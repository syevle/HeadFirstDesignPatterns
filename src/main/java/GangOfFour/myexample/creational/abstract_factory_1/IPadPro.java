package GangOfFour.myexample.creational.abstract_factory_1;


public class IPadPro implements Tablet {

	@Override
	public String info() {
		String msg = String.format("This is %s - %s."
								, "iPad Pro", "12.9-inches display");
		return msg;
	}
}
