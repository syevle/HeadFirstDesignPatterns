package GangOfFour.myexample.behavioral.mediatorpattern_2;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediatorImpl();
		User ram = new UserImpl(chatMediator, "Ram");
		User david = new UserImpl(chatMediator, "David");
		User juli = new UserImpl(chatMediator, "Juli");
		User steve = new UserImpl(chatMediator, "Steve");

		chatMediator.addUser(ram);
		chatMediator.addUser(david);
		chatMediator.addUser(juli);
		chatMediator.addUser(steve);

		steve.send("Hello Everybody...Shall we start the meeting?");

	}

}

/*
Steve: Sending Message=Hello Everybody...Shall we start the meeting?

Ram: Received Message:Hello Everybody...Shall we start the meeting?
David: Received Message:Hello Everybody...Shall we start the meeting?
Juli: Received Message:Hello Everybody...Shall we start the meeting?

 */