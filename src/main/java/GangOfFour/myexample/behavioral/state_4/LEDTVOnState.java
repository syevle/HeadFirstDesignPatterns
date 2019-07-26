package GangOfFour.myexample.behavioral.state_4;

public class LEDTVOnState implements StateOfLedTv {

	@Override
	public void doTurnOnOrOff() {
		System.out.println("TV is turned ON");
	}

}
