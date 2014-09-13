package myexample.behavioral.commandpattern;

public class Button {
	Command c;

	public Button(Command c) {
		this.c = c;
	}

	public void click(){
		c.execute();
	}
}
