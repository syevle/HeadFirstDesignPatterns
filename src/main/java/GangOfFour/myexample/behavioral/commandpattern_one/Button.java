package GangOfFour.myexample.behavioral.commandpattern_one;

public class Button {
	Command c;

	public Button(Command c) {
		this.c = c;
	}

	public void click(){
		c.execute();
	}
}
