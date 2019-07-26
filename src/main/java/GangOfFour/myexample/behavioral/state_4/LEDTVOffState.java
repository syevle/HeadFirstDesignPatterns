package GangOfFour.myexample.behavioral.state_4;

public class LEDTVOffState implements StateOfLedTv {

	@Override
	public void doTurnOnOrOff() {
		System.out.println("TV is turned OFf");
	}

}
