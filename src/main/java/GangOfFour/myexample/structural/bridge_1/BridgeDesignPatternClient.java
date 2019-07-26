package GangOfFour.myexample.structural.bridge_1;

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
Please enter the color you want to fill  : 'Green' or 'Blue'
Green
color : Green
Rectangale has been drawn with out any color
Circle has been drawn with out any color

Rectangle filled with green color using GreenColorImplementor
Circle filled with green color using GreenColorImplementor

 */
