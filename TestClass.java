
public class TestClass {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		System.out.println("Radius:" + c1.getRadius());
		System.out.println("Colour:" + c1.getColour());
		System.out.printf("Area::%.2f%n", c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("Radius:" + c2.getRadius());
		System.out.println("Colour:" + c2.getColour());
		System.out.printf("Area: %.2f%n", c2.getArea());

		Circle c3 = new Circle(2.0, "yellow");
		System.out.println("Radius:" + c3.getRadius());
		System.out.println("Colour:" + c3.getColour());
		System.out.printf("Area:%.2f%n", c3.getArea());

	}

}
