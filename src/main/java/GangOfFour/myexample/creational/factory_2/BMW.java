package GangOfFour.myexample.creational.factory_2;

import java.util.Random;
public class BMW implements Car{

	int id;
	
	public BMW() {
		Random randomno = new Random();
		id = randomno.nextInt();
	}
	
	@Override
	public String info() {
		String msg = String.format("Hello World! I'm a new %s. My Id = %d"
									, "BMW", id);
		return msg;
	}
}
