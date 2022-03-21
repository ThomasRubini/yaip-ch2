package ex6.part8;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public String toString() {
		return "MovableRectangle[topLeft=%s,bottomRight=%s]".formatted(topLeft, bottomRight);
	}

	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}

	/*
	Difference between an interface and an abstract class :
	an abstract class can have implemented methods, but you can only extend from one class, whereas you can implement as many interfaces as you want in one class
	 */
}
