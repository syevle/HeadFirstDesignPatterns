package GangOfFour.myexample.behavioral.mediatorpattern_2;


public interface ChatMediator {
	public void sendMessage(String message, User user);

	public void addUser(User user);
}