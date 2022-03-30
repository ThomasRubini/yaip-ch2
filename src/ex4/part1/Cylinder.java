package ex4.part1;

public class Cylinder extends Circle {

	private double height;

	public Cylinder(){
		this(1.0);
	}

	public Cylinder(double radius){
		this(radius, 1.0);
	}

	public Cylinder(double radius, double height){
		this(radius, height, "red");
	}

	public Cylinder(double radius, double height, String color){
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume(){
		return getArea()*height;
	}


	@Override
	public String toString() {
		return "Cylinder: subclass of %s height=%s".formatted(super.toString(), height);
	}
}
