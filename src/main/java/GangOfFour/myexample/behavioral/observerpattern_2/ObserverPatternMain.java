package GangOfFour.myexample.behavioral.observerpattern_2;

import java.util.List;

public class ObserverPatternMain {

	public static void main(String[] args) {
		Product samsungLEDTV = new Product("Samsung LED TV", "LED TV",
				"60000Rs", "Not available");
		// Person david object will be created and person david object will be
		// registered to the subject
		Person david = new Person("David", samsungLEDTV);
		// Person john object will be created and person john object will be
		// registered to the subject
		Person john = new Person("John", samsungLEDTV);

		List<Observer> subscribers = samsungLEDTV.getObservers();
		System.out.println("subscribers List : " + subscribers);

		subscribers.forEach(e->{
			Person person = (Person) e;
			System.out.println("This person has subscribed : " + person.getPersonName());
		});

		System.out.println();
		System.out.println("SamsungLED TV current state : " + samsungLEDTV.getAvailability());
		System.out.println();
		// Now product is available
		samsungLEDTV.setAvailability("Available");
	}

}

/*
subscribers List : [GangOfFour.myexample.behavioral.observerpattern_two.Person@3cd1a2f1, GangOfFour.myexample.behavioral.observerpattern_two.Person@2f0e140b]
This person has subscribed : David
This person has subscribed : John

SamsungLED TV current state : Not available

Availability changed from Not available to Available
Product Name :Samsung LED TV, Product Type : LED TV, product Price : 60000Rs is available now.So notifying all the users

Hello David, Product is now Available on flipkart
Hello John, Product is now Available on flipkart
 */
