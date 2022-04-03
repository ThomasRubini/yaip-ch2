package ex1.part1;

public class Circle {
	private double radius;
	private String color;

	public Circle(){
		this(1);
	}

	public Circle(double radius){
		this(radius, "red");
	}

	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	public double getRadius(){
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea(){
		return Math.PI*radius*radius;
	}

	public double getCircumference(){
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle[radius=%s]".formatted(radius);
	}
}
