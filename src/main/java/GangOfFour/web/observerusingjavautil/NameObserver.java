package GangOfFour.web.observerusingjavautil;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {
	private String name;

	public NameObserver() {
		name = null;
		System.out.println("NameObserver created: Name is " + name);
	}

	public void update(Observable obj, Object arg) {
		
		ConcreteSubject c = (ConcreteSubject)obj;
		System.out.println(c.getName() + "---------"+c.getPrice());
		if (arg instanceof String) {
			name = (String) arg;
			System.out.println("NameObserver: Name changed to " + name);
		} else {
			System.out.println("NameObserver: Some other change to subject!");
		}
	}
}
