package GangOfFour.myexample.behavioral.commandpattern;

public class OnCommand implements Command {

	private ConsumerElectronics ce;

	public OnCommand(ConsumerElectronics ce) {
		this.ce = ce;
	}

	public void execute() {
		ce.on();
	}
}
