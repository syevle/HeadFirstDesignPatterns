package GangOfFour.myexample.structural.decorator_1;

public class OnionDosaDecorator extends DosaDecorator {

	public OnionDosaDecorator(Dosa dosa) {
		super(dosa);
	}

	public String makeDosa() {
		return dosa.makeDosa() + addOnion();

	}

	private String addOnion() {
		return ",Onion added";
	}
}
