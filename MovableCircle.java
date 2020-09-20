package Lab15;

public class MovableCircle implements Moveable {

	private int radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
		this.radius = radius;
		center = new MovablePoint(x, y, xspeed, yspeed);
	}

	@Override
	public void moveUp() {
		center.y += center.yspeed;

	}

	@Override
	public void moveDown() {
		center.y -= center.yspeed;

	}

	@Override
	public void moveRight() {
		center.x += center.xspeed;

	}

	@Override
	public void moveLeft() {
		center.x -= center.xspeed;

	}

	@Override
	public String toString() {
		return "MovablePoint[ x= " + center.x + " ,y = " + center.y + " ,xspeed= " + center.xspeed + " ,yspeed = "
				+ center.yspeed + " ,radius = " + radius + " ]";
	}

}
