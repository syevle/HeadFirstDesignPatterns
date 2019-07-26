package GangOfFour.myexample.structural.flyweight_2;

//A context, here is table number
class CoffeeContext {
	private final int tableNumber;

	public CoffeeContext(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTable() {
		return this.tableNumber;
	}
}
