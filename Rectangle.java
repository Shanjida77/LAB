
public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		super();
		setWidth(1.0);
		setLength(1.0);
	}

	public Rectangle(double width, double length) {
		super();
		this.setWidth(width);
		this.setLength(length);
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.setWidth(width);
		this.setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return (length * width);

	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);

	}

	@Override
	public String toString() {
		return "Circle[ length=" + length + " ,width=" + width + " ,color =" + getColor() + ",filled =" + isFilled()
				+ " ]";

	}

}
