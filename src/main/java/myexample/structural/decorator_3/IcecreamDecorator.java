package myexample.structural.decorator_3;

abstract class IcecreamDecorator implements Icecream {

	protected Icecream specialVanillaIcecream;

	public IcecreamDecorator(Icecream specialVanillaIcecream) {
		this.specialVanillaIcecream = specialVanillaIcecream;
	}

	public String makeIcecream() {
		return specialVanillaIcecream.makeIcecream();
	}
}
