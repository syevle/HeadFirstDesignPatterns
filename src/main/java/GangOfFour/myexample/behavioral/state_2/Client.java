package GangOfFour.myexample.behavioral.state_2;

public class Client {

	public static void main(String[] args) {

		/*
		 * Initially Vending Machine will be 'noMoneyState'
		 */
		VendingMachine vendingMachine = new VendingMachine();

		System.out.println("Current VendingMachine State : "
				+ vendingMachine.getVendingMachineState().getClass().getName()
				+ "\n");

		vendingMachine.dispenseProduct();
		vendingMachine.selectProductAndInsertMoney(100, "Pepsi");

		/*
		 * Money has been inserted so vending Machine changed the internal state
		 * to 'hasMoneyState'
		 */

		System.out.println("\nCurrent VendingMachine State : "
				+ vendingMachine.getVendingMachineState().getClass().getName()
				+ "\n");

		vendingMachine.selectProductAndInsertMoney(100, "Fanta");
		vendingMachine.dispenseProduct();

		/*
		 * Product has been dispensed so vending Machine changed the internal
		 * state to 'NoMoneyState'
		 */

		System.out.println("\nCurrent VendingMachine State : "
				+ vendingMachine.getVendingMachineState().getClass().getName());

	}

}

/*
Current VendingMachine State : GangOfFour.myexample.behavioral.state_2.NoMoneyState

Vending Machine cannot dispense product because money is not inserted and product is not selected...
100Rs has been inserted and Pepsi has been selected...
VendingMachine internal state has been moved to : GangOfFour.myexample.behavioral.state_2.HasMoneyState

Current VendingMachine State : GangOfFour.myexample.behavioral.state_2.HasMoneyState

Already Vending machine has money and product selected,So wait till it finish the current dispensing process ...
Vending Machine  dispensed the product ...
VendingMachine internal state has been moved to : GangOfFour.myexample.behavioral.state_2.NoMoneyState

Current VendingMachine State : GangOfFour.myexample.behavioral.state_2.NoMoneyState

 */
