package Lab15;

public class Test {

	public static void main(String[] args) {
		MovablePoint mp = new MovablePoint(1, 2, 1, 2);
		System.out.println(mp);
		mp.moveRight();
		System.out.println(mp);
		System.out.println();

		MovableCircle mc = new MovableCircle(1, 2, 3, 2, 8);
		System.out.println(mc);
		mc.moveLeft();
		System.out.println(mc);
		System.out.println();

	}
}
