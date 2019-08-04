package GangOfFour.myexample.behavioral.mediatorpattern_3;

public interface FacebookGroupMediator {

	public void sendMessage(String msg, User user);

	void registerUser(User user);
}
