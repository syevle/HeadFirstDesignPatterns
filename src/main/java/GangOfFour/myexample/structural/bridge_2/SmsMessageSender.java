package GangOfFour.myexample.structural.bridge_2;

public class SmsMessageSender implements MessageSender {
	public void sendMessage(String message) {
		System.out.println("'" + message
				+ "'   : This Message has been sent using SMS");
	}
}
