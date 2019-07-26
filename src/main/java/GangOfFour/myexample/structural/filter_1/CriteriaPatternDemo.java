package GangOfFour.myexample.structural.filter_1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "NotMarried"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Mike", "Male", "NotMarried"));
		persons.add(new Person("Bobby", "Male", "NotMarried"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "NotMarried"));

		printPersons(persons);

		System.out
				.println("---------------------------------------------------------------------");

		Criteria male = new MaleCriteria();

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		Criteria female = new FemaleCriteria();

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		Criteria notMarried = new NotMarriedCriteria();

		System.out.println("\nNotMarried: ");
		printPersons(notMarried.meetCriteria(persons));

		Criteria married = new MarriedCriteria();

		System.out.println("\nMarried: ");
		printPersons(married.meetCriteria(persons));

		Criteria marriedMale = new CriteriaAndCondition(married, male);

		System.out.println("\nMarried and Male: ");
		printPersons(marriedMale.meetCriteria(persons));

		Criteria notMarriedOrFemale = new CriteriaOrCondition(notMarried,
				female);

		System.out.println("\nNotMarried Or Female");
		printPersons(notMarriedOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName()
					+ ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}

/*
		Person : [ Name : Robert, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : John, Gender : Male, Marital Status : Married ]
		Person : [ Name : Mike, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Bobby, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Laura, Gender : Female, Marital Status : Married ]
		Person : [ Name : Diana, Gender : Female, Marital Status : NotMarried ]
		---------------------------------------------------------------------
		Males:
		Person : [ Name : Robert, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : John, Gender : Male, Marital Status : Married ]
		Person : [ Name : Mike, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Bobby, Gender : Male, Marital Status : NotMarried ]

		Females:
		Person : [ Name : Laura, Gender : Female, Marital Status : Married ]
		Person : [ Name : Diana, Gender : Female, Marital Status : NotMarried ]

		NotMarried:
		Person : [ Name : Robert, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Mike, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Bobby, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Diana, Gender : Female, Marital Status : NotMarried ]

		Married:
		Person : [ Name : John, Gender : Male, Marital Status : Married ]
		Person : [ Name : Laura, Gender : Female, Marital Status : Married ]

		Married and Male:
		Person : [ Name : John, Gender : Male, Marital Status : Married ]

		NotMarried Or Female
		Person : [ Name : Robert, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Mike, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Bobby, Gender : Male, Marital Status : NotMarried ]
		Person : [ Name : Diana, Gender : Female, Marital Status : NotMarried ]
		Person : [ Name : Laura, Gender : Female, Marital Status : Married ]

*/