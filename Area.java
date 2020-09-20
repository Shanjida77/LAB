
public class Area extends Shape {

	public double RectangleArea(double length, double breadth) {
		double Area = length * breadth;
		System.out.println("Area of Rectangle: " + Area);
		return Area;
	}

	public double SquareArea(double side) {
		double Area = side * side;
		System.out.println("Area of Square: " + Area);
		return Area;
	}

	public double CircleArea(double radius) {
		double Area = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + Area);
		return Area;
	}
}
