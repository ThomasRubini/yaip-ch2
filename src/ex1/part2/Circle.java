package ex1.part2;

public class Circle {
	private double radius;

	public Circle(){
		this(1);
	}

	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
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
