package web.ObserverPattern;
/**
 * http://javapostsforlearning.blogspot.com/2013/02/observer-design-pattern-in-java.html
 * @author syevle
 *
 */
public class ObserverPatternMain {

	/**
	 * @Author arpit mandliya
	 */
	public static void main(String[] args) {
		Person arpitPerson=new Person("Arpit");
		Person johnPerson=new Person("John");
		
		Product samsungMobile=new Product("Samsung", "Mobile", "Not available");
		
		//When you opt for option "Notify me when product is available".Below registerObserver method
		//get executed
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);
		
		//Now product is available
		samsungMobile.setAvailability("Available");
		
	}

}
