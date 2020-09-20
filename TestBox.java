
public class TestBox {

	public static void main(String[] args) {

		Box b1 = new Box();
		System.out.print(b1);
		System.out.println(" Volume:" + b1.volume());
		System.out.println();

		Box b2 = new Box(7);
		System.out.print(b2);
		System.out.println(" Volume:" + b2.volume());
		System.out.println();

		Box b3 = new Box(6, 8, 9);
		System.out.print(b3);
		System.out.println(" Volume:" + b3.volume());
		System.out.println();

		Box b4 = new Box(b3);
		System.out.print(b4);
		System.out.println(" Volume:" + b4.volume());
		System.out.println();

		System.out.println("Are b1 and b2 equal ? " + b1.equalTo(b2));
		System.out.println("Are b3 and b4 equal ? " + b3.equalTo(b4));

	}

}