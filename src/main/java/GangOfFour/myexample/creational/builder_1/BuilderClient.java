package GangOfFour.myexample.creational.builder_1;

/*
 *  Customer who is in hotel and customer can place order to 
 *  HotelWaiter or Servant.
 */
public class BuilderClient {
	public static void main(String[] args) {

		Beverage tea = HotelWaiter.takeOrder("tea");
		System.out.println(tea);
		Beverage coffee = HotelWaiter.takeOrder("coffee");
		System.out.println(coffee);
	}
}

/*
Tea
Step 1 : Boiling water
Step 2 : Adding milk
Step 3 : Adding sugar
Step 4 : Adding 9 Grams of tea powder
Hot Tea!!!!  [40 ml of water, 50ml of milk, 10 gm of sugar, 9 gm of Tea]

Coffee
Step 1 : Boiling water
Step 2 : Adding milk
Step 3 : Adding sugar
Step 4 : Adding 9 Grams of coffee powder
Hot Coffee!!!!  [40 ml of water, 50ml of milk, 10 gm of sugar, 9 gm of Coffee]


 */