package GangOfFour.web.observerusingjavautil;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
	private float price;

	public PriceObserver() {
		price = 0;
		System.out.println("PriceObservercreated: Price is " + price);
	}

	public void update(Observable obj, Object arg) {
		ConcreteSubject c = (ConcreteSubject)obj;
		System.out.println(c.getName() + "---------"+c.getPrice());
		if (arg instanceof Float) {
			price = ((Float) arg).floatValue();
			System.out.println("PriceObserver: Price changed to " + price);
		} else {
			System.out.println("PriceObserver: Some other change to subject!");
		}
	}
}
