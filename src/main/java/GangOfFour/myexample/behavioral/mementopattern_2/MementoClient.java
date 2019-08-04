package GangOfFour.myexample.behavioral.mementopattern_2;

public class MementoClient {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setLedTV(new LedTV("42 inch", "60000Rs", false));

		Caretaker caretaker = new Caretaker();
		caretaker.addMemento(originator.createMemento());

		originator.setLedTV(new LedTV("46 inch", "80000Rs", true));
		caretaker.addMemento(originator.createMemento());

		originator.setLedTV(new LedTV("50 inch", "100000Rs", true));
		System.out.println("\nOrignator current state : " + originator);

		System.out.println("\nOriginator restoring to 42 inch LED TV...");

		originator.setMemento(caretaker.getMemento(0));

		System.out.println("\nOrignator current state : " + originator);

	}

}


/*====================== OutPut ========================
LED TV's snapshots Maintained by CareTaker :[Memento [ledTV=LedTV [size=42 inch, price=60000Rs, usbSupport=false]]]
LED TV's snapshots Maintained by CareTaker :[Memento [ledTV=LedTV [size=42 inch, price=60000Rs, usbSupport=false]], Memento [ledTV=LedTV [size=46 inch, price=80000Rs, usbSupport=true]]]

Orignator current state : Originator [ledTV=LedTV [size=50 inch, price=100000Rs, usbSupport=true]]

Originator restoring to 42 inch LED TV...

Orignator current state : Originator [ledTV=LedTV [size=42 inch, price=60000Rs, usbSupport=false]]
 */