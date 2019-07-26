package GangOfFour.myexample.behavioral.mementopattern_one;

public class Originator {
	
	//this String is just for example
	//in real world application this 
	//will be a java class - the object
	//for which the state to be stored
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento memento) {
		state = memento.getState();
	}
}
