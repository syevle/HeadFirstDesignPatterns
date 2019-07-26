package GangOfFour.myexample.structural.decorator_3;

public class DecoratorClient {

	public static void main(String args[]) {
		VanillaIcecream vanillaIcecreamObj = new VanillaIcecream();
		String vanillaIcecream = vanillaIcecreamObj.makeIcecream();
		System.out.println(vanillaIcecream);
		String vanillaIcecreamWithNuts = new NuttyDecorator(vanillaIcecreamObj)
				.makeIcecream();
		System.out.println("\n'" + vanillaIcecreamWithNuts
				+ "' is prepared using NuttyDecorator");
		String vanillaIcecreamWithChocalate = new ChocolateDecorator(
				vanillaIcecreamObj).makeIcecream();
		System.out.println("\n'" + vanillaIcecreamWithChocalate
				+ "' is prepared using ChocolateDecorator");
		String vanillaIcecreamWithChocalateAndNuts = new NuttyDecorator(
				new ChocolateDecorator(vanillaIcecreamObj)).makeIcecream();
		System.out.println("\n'" + vanillaIcecreamWithChocalateAndNuts
				+ "' is prepared using ChocolateDecorator and NuttyDecorator");
	}

}

/*
Vanilla Icecream

'Vanilla Icecream + with nuts' is prepared using NuttyDecorator

'Vanilla Icecream + with chocolate' is prepared using ChocolateDecorator

'Vanilla Icecream + with chocolate + with nuts' is prepared using ChocolateDecorator and NuttyDecorator

 */
