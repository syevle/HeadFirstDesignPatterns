package myexample.structural.bridge_1;

import java.util.Scanner;

public class BridgeDesignPatternClient {

	public static void main(String[] args) {

		System.out
				.println("Please enter the color you want to fill  : 'Green' or 'Blue'");
		Scanner scanner = new Scanner(System.in);
		String color = scanner.next();
		System.out.println("color : " + color);

		Shape rectangleShape = new Rectangle();
		rectangleShape.draw();
		Shape circleShape = new Circle();
		circleShape.draw();
		System.out.println();
		if ("blue".equalsIgnoreCase(color)) {
			rectangleShape.setColor(new BlueColorImplementor());
			rectangleShape.colorIt();

			circleShape.setColor(new BlueColorImplementor());
			circleShape.colorIt();

		} else if ("green".equalsIgnoreCase(color)) {
			rectangleShape.setColor(new GreenColorImplementor());
			rectangleShape.colorIt();

			circleShape.setColor(new GreenColorImplementor());
			circleShape.colorIt();
		}

	}
}

/*
HR system passes employee string array to Adapter

Adapter converted Array of Employee to ArrayList of Employee :
[Employee [empId=100, name=Dave, designation=Team Leader], Employee [empId=101, name=Ram, designation=Developer], Employee [empId=102, name=Raj, designation=Developer], Employee [empId=103, name=Rahul, designation=Tester]]
then call the processSalary method inherited from the ThirdPartyBillingSystem for processing the employee salary

Employee [empId=100, name=Dave, designation=Team Leader] : 70000Rs Salary credited to Dave Account


Employee [empId=101, name=Ram, designation=Developer] : 40000Rs Salary credited to Ram Account


Employee [empId=102, name=Raj, designation=Developer] : 40000Rs Salary credited to Raj Account


Employee [empId=103, name=Rahul, designation=Tester] : 30000Rs Salary credited to Rahul Account

 */
