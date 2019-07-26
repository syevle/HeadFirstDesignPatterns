package GangOfFour.myexample.behavioral.mementopattern_one;

import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> statesList = new ArrayList<Memento>();

	public void addMemento(Memento m) {
		statesList.add(m);
	}

	public Memento getMemento(int index) {
		return statesList.get(index);
	}
}
