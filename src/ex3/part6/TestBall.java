package ex3.part6;

public class TestBall {
	public static void main(String[] args) {
		Ball b = new Ball(10, 10, 5, 1, 180);
		System.out.println(b.getX());
		System.out.println(b.getY());
		System.out.println(b.getRadius());
		System.out.println(b.getXDelta());
		System.out.println(b.getYDelta());
		System.out.println(b);
		b.move();
		System.out.println(b);
		b.reflectHorizontal();
		System.out.println(b);
		b.reflectVertical();
		System.out.println(b);
	}
}
