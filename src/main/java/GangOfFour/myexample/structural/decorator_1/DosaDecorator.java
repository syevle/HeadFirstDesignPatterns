package GangOfFour.myexample.structural.decorator_1;

abstract class DosaDecorator implements Dosa {

	protected Dosa dosa;

	public DosaDecorator(Dosa dosa) {
		this.dosa = dosa;
	}

	public String makeDosa() {
		return dosa.makeDosa();
	}
}
