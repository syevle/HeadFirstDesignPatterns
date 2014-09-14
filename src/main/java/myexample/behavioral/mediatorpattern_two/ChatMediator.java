package myexample.behavioral.mediatorpattern_two;


public interface ChatMediator {
	public void sendMessage(String message, User user);

	public void addUser(User user);
}