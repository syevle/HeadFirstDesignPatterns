package GangOfFour.myexample.behavioral.strategypattern_two;

public class DebitCardPaymentStrategy implements PaymentStrategy {

	public void pay(String amount) {
		System.out.println("Customer pays the money " + amount
				+ "Rs. using Debit Card");
	}

}