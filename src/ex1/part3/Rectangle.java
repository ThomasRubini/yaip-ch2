package ex1.part3;

public class Rectangle {
	private float length, width;

	public Rectangle(){
		this(1, 1);
	}

	public Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea(){
		return length*width;
	}

	public double getPerimeter(){
		return (length+width)*2;
	}

	@Override
	public String toString() {
		return "Rectangle[length=%s,width=%s]".formatted(length, width);
	}
}
