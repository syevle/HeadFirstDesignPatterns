package GangOfFour.myexample.behavioral.commandpattern_1;

public class UniversalRemote {

	public static ConsumerElectronics getActiveDevice() {
		// here we will have a complex electronic circuit :-)
		// that will maintain current device
		Television tv = new Television();
		return tv;
	}

}
