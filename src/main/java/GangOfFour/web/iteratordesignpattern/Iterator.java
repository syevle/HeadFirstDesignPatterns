package GangOfFour.web.iteratordesignpattern;

public interface Iterator {
	public Animal nextAnimal();

	public boolean isLastAnimal();

	public Animal currentAnimal();
}
