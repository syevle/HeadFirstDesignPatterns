package myexample.behavioral.strategypattern_two;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {

		System.out
				.println("Please enter Payment Type : 'CreditCard' or 'DebitCard' or 'ByCash'");
		Scanner scanner = new Scanner(System.in);
		String paymentType = scanner.next();
		System.out.println("Payment type is : " + paymentType);

		System.out.println("\nPlease enter Amount to Pay : ");
		Scanner scanner1 = new Scanner(System.in);
		String amount = scanner1.next();
		System.out.println("amount is : " + amount);

		PaymentContext ctx = null;
		ctx = new PaymentContext();

		if ("CreditCard".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new CreditCardPaymentStrategy());
		} else if ("DebitCard".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new DebitCardPaymentStrategy());
		} else if ("ByCash".equalsIgnoreCase(paymentType)) {
			ctx.setPaymentStrategy(new ByCashPaymentStrategy());
		}

		System.out.println("PaymentContext has :" + ctx.getPaymentStrategy());

		ctx.pay(amount);

	}
}
/*
Please enter Payment Type : 'CreditCard' or 'DebitCard' or 'ByCash'

CreditCard
Payment type is : CreditCard

Please enter Amount to Pay :
23
amount is : 23
PaymentContext has :myexample.behavioral.strategypattern_two.CreditCardPaymentStrategy@3d075dc0
Customer pays the money 23Rs. using Credit Card
 */

/*
Please enter Payment Type : 'CreditCard' or 'DebitCard' or 'ByCash'

DebitCard
Payment type is : DebitCard

Please enter Amount to Pay :
67
amount is : 67
PaymentContext has :myexample.behavioral.strategypattern_two.DebitCardPaymentStrategy@3d075dc0
Customer pays the money 67Rs. using Debit Card
 */
