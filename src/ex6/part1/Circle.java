package ex6.part1;

public class Circle extends Shape {
	private double radius;

	public Circle(){
		this(1.0);
	}
	public Circle(double radius){
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle[%s,radius=%s]".formatted(super.toString(), radius);
	}
}
