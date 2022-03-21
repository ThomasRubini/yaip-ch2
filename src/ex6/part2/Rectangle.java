package ex6.part2;

public class Rectangle implements GeometricObject {
	private final double width, length;

	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle[width=%s,length=%s]".formatted(width, length);
	}

	@Override
	public double getArea(){
		return width*length;
	}

	@Override
	public double getPerimeter(){
		return (width+length)*2;
	}
}