package ex2.part10;

import ex2.part9.MyPoint;

public class MyRectangle {
	private MyPoint topLeft, bottomRight;

	public MyRectangle(){
		this(new MyPoint(0, 0), new MyPoint(0, 0));
	}

	public MyRectangle(int x1, int y1, int x2, int y2){
		this(new MyPoint(x1, y1), new MyPoint(x2, y2));
	}

	public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	// Consumer should use the returned object to get X and Y coordinates
	public MyPoint getTopLeft(){
		return topLeft;
	}

	public void setTopLeft(MyPoint topLeft){
		this.topLeft = topLeft;
	}

	public MyPoint getBottomRight(){
		return bottomRight;
	}

	public void setBottomRight(MyPoint bottomRight){
		this.bottomRight = bottomRight;
	}

	public double getArea(){
		double xDiff = topLeft.getX()-bottomRight.getX();
		double yDiff = topLeft.getY()-bottomRight.getY();
		return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
	}

	public double getCircumference(){
		double xDiff = topLeft.getX()-bottomRight.getX();
		double yDiff = topLeft.getY()-bottomRight.getY();

		return (xDiff+yDiff)*2;
	}

	@Override
	public String toString() {
		return "MyRectangle[topLeft=%s,bottomRight=%s]".formatted(topLeft, bottomRight);
	}
}
