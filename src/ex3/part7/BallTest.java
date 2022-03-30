package ex3.part7;

public class BallTest {
	public static void main(String[] args) {
		Ball b = new Ball(1,2,3);
		System.out.println(b);
		b.setXYZ(4,5,6);
		System.out.println(b.getX());
		System.out.println(b.getY());
		System.out.println(b.getZ());
		System.out.println(b);
	}
}
