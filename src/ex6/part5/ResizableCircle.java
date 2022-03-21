package ex6.part5;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public String toString() {
		return "ResizableCircle[%s]".formatted(super.toString());
	}

	@Override
	public void resize(int percent) {
		radius *= percent / 100.0;
	}

}