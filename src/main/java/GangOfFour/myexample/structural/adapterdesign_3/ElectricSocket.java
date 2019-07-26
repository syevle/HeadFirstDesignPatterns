package GangOfFour.myexample.structural.adapterdesign_3;

public class ElectricSocket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
