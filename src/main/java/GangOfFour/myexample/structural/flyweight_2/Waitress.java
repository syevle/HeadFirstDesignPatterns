package GangOfFour.myexample.structural.flyweight_2;

public class Waitress {
	// coffee array
	private static Coffee[] coffees = new Coffee[20];
	// table array
	private static CoffeeContext[] tables = new CoffeeContext[20];
	private static int ordersCount = 0;
	private static CoffeeFactory coffeeFactory;

	public static void takeOrder(String flavorIn, int table) {
		coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
		tables[ordersCount] = new CoffeeContext(table);
		ordersCount++;
	}

	public static void main(String[] args) {
		coffeeFactory = new CoffeeFactory();

		takeOrder("Cappuccino", 2);
		takeOrder("Cappuccino", 2);
		takeOrder("Regular Coffee", 1);
		takeOrder("Regular Coffee", 2);
		takeOrder("Regular Coffee", 3);
		takeOrder("Regular Coffee", 4);
		takeOrder("Cappuccino", 4);
		takeOrder("Cappuccino", 5);
		takeOrder("Regular Coffee", 3);
		takeOrder("Cappuccino", 3);

		for (int i = 0; i < ordersCount; ++i) {
			coffees[i].serveCoffee(tables[i]);
		}

		System.out.println("\nTotal Coffee objects made: "
				+ coffeeFactory.getTotalCoffeeFlavorsMade());
	}
}
/*
	    Coffee is created! - Cappuccino
		Coffee is created! - Regular Coffee
		Serving Cappuccino to table 2
		Serving Cappuccino to table 2
		Serving Regular Coffee to table 1
		Serving Regular Coffee to table 2
		Serving Regular Coffee to table 3
		Serving Regular Coffee to table 4
		Serving Cappuccino to table 4
		Serving Cappuccino to table 5
		Serving Regular Coffee to table 3
		Serving Cappuccino to table 3

		Total Coffee objects made: 2
*/