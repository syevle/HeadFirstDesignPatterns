package GangOfFour.myexample.behavioral.iteratordesignpattern_1;

public interface Iterator {
	public Animal nextAnimal();

	public boolean isLastAnimal();

	public Animal currentAnimal();
}
