package ex3.part6;

public class Container {
	private int x1, y1, x2, y2;

	public Container(int x, int y, int width, int height){
		this.x1 = x;
		this.y1 = y;

		this.x2 = x1+width;
		this.y2 = y1+height;
	}

	public int getX() {
		return x1;
	}

	public int getY() {
		return y1;
	}

	public int getWidth() {
		return x2-x1;
	}

	public int getHeight() {
		return y2-y1;
	}

	// collides() or collidesWith() ?
	public boolean collides(Ball ball){
		if (ball.getX() - ball.getRadius() <= this.x1 ||
				ball.getX() + ball.getRadius() >= this.x2) {
			ball.reflectHorizontal();
			return true;
		}
		if (ball.getY() - ball.getRadius() <= this.y1 ||
				ball.getY() + ball.getRadius() >= this.x2){
			ball.reflectVertical();
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Container at (%s,%s) to (%s,%s)".formatted(x1, y1, x2, y2);
	}
}
