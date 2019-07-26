package GangOfFour.myexample.structural.bridge_4;

public class Client {

	public static void main(String[] args) {

		SonyRemoteControl sonyRemoteControl = new SonyRemoteControl(
				new SonyLedTv());
		sonyRemoteControl.switchOn();
		sonyRemoteControl.switchOff();
		sonyRemoteControl.setChannel(20);
		System.out
				.println("**********************************************************************");
		SamsungRemoteControl samsungRemoteControl = new SamsungRemoteControl(
				new SamsungLedTv());
		samsungRemoteControl.switchOn();
		samsungRemoteControl.switchOff();
		samsungRemoteControl.setChannel(20);
	}
}

/*
Turning ON.. Sony TV.
Turning Off.. Sony TV.
Setting channel Number 20.. on Sony TV
**********************************************************************
Turning ON.. Samsung TV.
Turning Off.. Samsung TV.
Setting channel Number 20.. on Samsung TV
 */
