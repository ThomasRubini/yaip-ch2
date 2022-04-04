package ex2.part8;

public class MyCircle {
	private MyPoint center;
	private int radius;

	public MyCircle(){
		this(0, 0, 1);
	}

	public MyCircle(int x, int y, int radius){
		this(new MyPoint(x, y), radius);
	}

	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		center.setX(x);
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterY(int y) {
		center.setY(y);
	}

	public int[] getCenterXY() {
		return new int[]{center.getX(), center.getY()};
	}

	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}

	@Override
	public String toString() {
		return "MyCircle[radius=%s,center=%s".formatted(radius, center);
	}

	public double getArea(){
		return Math.PI*radius*radius;
	}

	public double getCicumference(){
		return 2*Math.PI*radius;
	}

	public double distance(MyCircle another){
		return center.distance(another.center);
	}

}
