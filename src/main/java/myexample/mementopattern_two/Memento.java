package myexample.mementopattern_two;

public class Memento {
	private LedTV ledTV;

	public Memento(LedTV ledTV) {
		super();
		this.ledTV = ledTV;
	}

	public LedTV getLedTV() {
		return ledTV;
	}

	public void setLedTV(LedTV ledTV) {
		this.ledTV = ledTV;
	}

	@Override
	public String toString() {
		return "Memento [ledTV=" + ledTV + "]";
	}

}