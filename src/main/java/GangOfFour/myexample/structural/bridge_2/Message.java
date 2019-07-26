package GangOfFour.myexample.structural.bridge_2;

abstract class Message {
	protected MessageSender messageSender;

	abstract public void sendMessage(String message);

}
