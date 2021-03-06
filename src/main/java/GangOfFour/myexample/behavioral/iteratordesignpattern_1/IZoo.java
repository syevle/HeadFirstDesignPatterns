package GangOfFour.myexample.behavioral.iteratordesignpattern_1;

import java.util.List;

public interface IZoo {

	public List<Animal> getAnimals();

	public void addAnimal(Animal animal);

	public void removeAnimal(Animal animal);

	public Iterator createIterator(String iteratorType);
}
