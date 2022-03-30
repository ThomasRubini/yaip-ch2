package ex4.part3;

import ex5.part1.Point;

public class Point2D {
	private float x, y;

	public Point2D(){
		this(0, 0);
	}

	public Point2D(float x, float y) {
		setXY(x, y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y){
		this.x = x;
		this.y = y;
	}

	public float[] getXY(){
		return new float[]{x, y};
	}

	@Override
	public String toString() {
		return "(%s,%s)".formatted(x, y);
	}
}
