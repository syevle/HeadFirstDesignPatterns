package GangOfFour.myexample.behavioral.commandpattern_2;

public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}
}
/*
Stock [ Name: ABC,	Quantity: 10 ] bought
Stock [ Name: ABC,	Quantity: 10 ] sold

 */