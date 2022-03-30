package ex4.part5;

public class Square extends Rectangle {
	public Square(){
		this(1.0);
	}

	public Square(double side){
		super(side, side);
	}

	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}

	public double getSide(){
		return getWidth();
	}

	public void setSide(double side){
		setWidth(side);
		setLength(side);
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setLength(width);
	}

	@Override
	public void setLength(double length) {
		super.setWidth(length);
		super.setLength(length);
	}

	@Override
	public String toString() {
		return "Square[%s]".formatted(super.toString());
	}
}
