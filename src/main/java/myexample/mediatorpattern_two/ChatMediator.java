package myexample.mediatorpattern_two;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
	public void sendMessage(String message, User user);

	public void addUser(User user);
}