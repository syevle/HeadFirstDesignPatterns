package GangOfFour.myexample.structural.decorator_5;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape blueCircle = new BlueShapeDecorator(new Circle());

		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

		System.out
				.println("\nCreate Blue color Circle using BlueShapeDecorator");
		blueCircle.draw();

		System.out
				.println("\nCreate Blue color Rectangle using BlueShapeDecorator");
		blueRectangle.draw();
	}
}
/*

		Create Blue color Circle using BlueShapeDecorator
		Shape: Circle has been drawn
		Color: Blue has been applied to GangOfFour.myexample.structural.decorator_5.Circle@3cd1a2f1

		Create Blue color Rectangle using BlueShapeDecorator
		Shape: Rectangle has been drawn
		Color: Blue has been applied to GangOfFour.myexample.structural.decorator_5.Rectangle@2f0e140b

		*/