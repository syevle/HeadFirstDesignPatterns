package myexample.mediatorpattern_three;


public interface FacebookGroupMediator {

	public void sendMessage(String msg, User user);

	void registerUser(User user);
}
