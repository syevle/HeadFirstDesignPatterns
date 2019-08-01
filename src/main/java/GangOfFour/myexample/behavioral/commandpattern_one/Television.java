package GangOfFour.myexample.behavioral.commandpattern_one;

public class Television implements ConsumerElectronics {

	public void on() {
		System.out.println("Television is on!");
	}
	
	@Override
	public void mute() {
		System.out.println("Television is muted!");
		
	}	
}