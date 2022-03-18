package ex6.part1;

public class Square extends Rectangle {

	public Square(){
		super();
	}

	public Square(double side){
		super(side, side);
	}

	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}

	public double getSide(){
		return getLength();
	}

	public void setSide(double side){
		// I hate this
		setWidth(side);
		setLength(side);
	}

	@Override
	public void setWidth(double side) {
		setSide(side);
	}

	@Override
	public void setLength(double side) {
		setSide(side);
	}

	@Override
	public String toString() {
		return "Square[%s]".formatted(super.toString());
	}
}
