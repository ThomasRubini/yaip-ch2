package ex5.part2;

public class Cylinder {
	private Circle base;
	private double height;

	public Cylinder() {
		this.base = new Circle();
		this.height = 1.0;
	}
	public Cylinder(double radius) {
		this.base = new Circle(radius);
		this.height = 1.0;
	}

	public Cylinder(double radius, double height){
		this.base = new Circle(radius);
		this.height = height;
	}
	public Cylinder(double radius, double height, String color){
		this.base = new Circle(radius, color);
		this.height = height;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/*
	Composition design is also better here, because we don't expose methods such as getArea() to the public API of Cylinder,
	which would be disturbing for the consumer of the API
	 */
}
