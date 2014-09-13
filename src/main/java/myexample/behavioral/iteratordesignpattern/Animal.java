package myexample.behavioral.iteratordesignpattern;

public class Animal {
	private String animalName;
	private String animalType;

	public Animal(String animalName, String animalType) {
		this.animalName = animalName;
		this.animalType = animalType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((animalName == null) ? 0 : animalName.hashCode());
		result = prime * result
				+ ((animalType == null) ? 0 : animalType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (animalName == null) {
			if (other.animalName != null)
				return false;
		} else if (!animalName.equals(other.animalName))
			return false;
		if (animalType == null) {
			if (other.animalType != null)
				return false;
		} else if (!animalType.equals(other.animalType))
			return false;
		return true;
	}
	
}
