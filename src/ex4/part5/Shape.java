package ex4.part5;

public class Shape {
	public String color;
	private boolean filled;

	public Shape(){
		this("red", true);
	}

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape[color=%s,filled=%s]".formatted(color, filled);
	}
}
