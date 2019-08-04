package GangOfFour.myexample.behavioral.commandpattern_1;

import java.util.List;

public class MuteAllCommand implements Command {
	List<ConsumerElectronics> ceList;

	public MuteAllCommand(List<ConsumerElectronics> ceList) {
		this.ceList = ceList;
	}

	@Override
	public void execute() {

		for (ConsumerElectronics ce : ceList) {
			ce.mute();
		}

	}
}
