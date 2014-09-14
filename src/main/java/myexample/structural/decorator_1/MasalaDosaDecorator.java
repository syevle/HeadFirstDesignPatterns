package myexample.structural.decorator_1;

public class MasalaDosaDecorator extends DosaDecorator {

	public MasalaDosaDecorator(Dosa dosa) {
		super(dosa);
	}

	public String makeDosa() {
		return dosa.makeDosa() + addMasala();
	}

	private String addMasala() {
		return ",Masala added";

	}
}
