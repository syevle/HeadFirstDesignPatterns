package myexample.structural.flyweight_1;

public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "Orange",
			"Black" };

	public static void main(String[] args) {

		System.out
				.println("\n################ Red color Circles ####################");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[0]);
			circle.draw();
		}
		System.out
				.println("\n############### Green color Circles ####################");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[1]);
			circle.draw();
		}
		System.out
				.println("\n################ Blue color Circles ####################");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[2]);
			circle.draw();
		}
		System.out
				.println("\n################ Orange color Circles ####################");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[3]);
			circle.draw();
		}
		System.out
				.println("\n################ Black color Circles ####################");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[4]);
			circle.draw();
		}
	}
}


/*

################ Red color Circles ####################
		Creating circle object with out any color in shapefactory : myexample.structural.flyweight_1.Circle@3cd1a2f1

		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Red, x : 10, y :20, radius :30

		############### Green color Circles ####################
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Green, x : 10, y :20, radius :30

		################ Blue color Circles ####################
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Blue, x : 10, y :20, radius :30

		################ Orange color Circles ####################
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Orange, x : 10, y :20, radius :30

		################ Black color Circles ####################
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
		myexample.structural.flyweight_1.Circle@3cd1a2f1 : Circle: Draw() [Color : Black, x : 10, y :20, radius :30
*/