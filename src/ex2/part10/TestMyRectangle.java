package ex2.part10;

import ex2.part9.MyPoint;

public class TestMyRectangle {
	public static void main(String[] args) {
		MyRectangle rec = new MyRectangle(5, 5, 0, 0);
		System.out.println(rec.getCircumference());
		System.out.println(rec.getArea());
		System.out.println(rec.getBottomRight());
		rec.setBottomRight(new MyPoint(1, 1));
		System.out.println(rec.getBottomRight());
		System.out.println(rec.getCircumference());
		System.out.println(rec);
	}
}
