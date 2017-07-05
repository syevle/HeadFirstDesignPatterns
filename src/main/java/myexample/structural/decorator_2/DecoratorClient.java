package myexample.structural.decorator_2;

public class DecoratorClient {

	public static void main(String args[]) {
		PlainPizza plainPizzaObj = new PlainPizza();
		String plainPizza = plainPizzaObj.makePizza();
		System.out.println(plainPizza);

		String chickenPizza = new ChickenPizzaDecorator(plainPizzaObj)
				.makePizza();
		System.out.println("\n'" + chickenPizza
				+ "' using ChickenPizzaDecorator");

		String vegPizza = new VegPizzaDecorator(plainPizzaObj).makePizza();
		System.out.println("\n'" + vegPizza + "' using VegPizzaDecorator");

	}

}

/*
Plain Pizza

'Plain Pizza ,Chicken and Cheese added' using ChickenPizzaDecorator

'Plain Pizza ,Vegetable and Cheese added' using VegPizzaDecorator
 */
