package ex2.part9;

public class TestTriangle {
	public static void main(String[] args) {
		MyTriangle tr = new MyTriangle(new MyPoint(0, 0), new MyPoint(1, 0), new MyPoint(0, 1));
		System.out.println(tr.getPerimeter());
		System.out.println(tr.getType());

		tr = new MyTriangle(0, 0, 4, 6, 1, 2);
		System.out.println(tr.getType());
	}
}
