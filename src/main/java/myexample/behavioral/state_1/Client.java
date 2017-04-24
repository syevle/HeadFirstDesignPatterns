package myexample.behavioral.state_1;

public class Client {

	public static void main(String[] args) {
		/*
		 * Initially ATM Machine in 'noDebitCardState'
		 */
		AtmMachine atmMachine = new AtmMachine();

		System.out.println("ATM Machine Current state : "
				+ atmMachine.getAtmMachineState().getClass().getName());

		System.out.println();
		atmMachine.enterPinAndWithdrawMoney();
		atmMachine.ejectDebitCard();
		atmMachine.insertDebitCard();

		System.out
				.println("\n*******************************************************");

		/*
		 * Debit Card has been inserted so internal state of ATM Machine has
		 * been changed to 'hasDebitCardState'
		 */
		System.out.println("\nATM Machine Current state : "
				+ atmMachine.getAtmMachineState().getClass().getName());
		System.out.println();

		atmMachine.enterPinAndWithdrawMoney();
		atmMachine.insertDebitCard();
		atmMachine.ejectDebitCard();
		System.out
				.println("\n*******************************************************");

		/*
		 * Debit Card has been ejected so internal state of ATM Machine has been
		 * changed to 'noDebitCardState'
		 */

		System.out.println("\nATM Machine Current state : "
				+ atmMachine.getAtmMachineState().getClass().getName());

	}

}

/*
ATM Machine Current state : myexample.behavioral.state_1.NoDebitCardState

No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money...
No Debit Card in ATM Machine slot, so you cannot eject the Debit Card...
DebitCard inserted ....
ATM Machine internal state has been moved to : myexample.behavioral.state_1.HasDebitCardState

*******************************************************

ATM Machine Current state : myexample.behavioral.state_1.HasDebitCardState

Pin number has been entered correctly and money has been withdrawn...
Debit Card is already there,So you cannot insert the Debit Card ...
Debit Card is ejected...
ATM Machine internal state has been moved to : myexample.behavioral.state_1.NoDebitCardState

*******************************************************

ATM Machine Current state : myexample.behavioral.state_1.NoDebitCardState

 */
