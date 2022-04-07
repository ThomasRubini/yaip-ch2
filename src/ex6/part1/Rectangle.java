package ex6.part1;

public class Rectangle extends Shape {
	private double width, length;

	public Rectangle(){
		this(1.0, 1.0);
	}

	public Rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
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
	double getArea() {
		return width*length;
	}

	@Override
	double getPerimeter() {
		return (width + length) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[%s,width=%s,length=%s]".formatted(super.toString(), width, length);
	}
}
