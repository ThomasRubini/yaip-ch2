package ex5.part1;

public class TestLine {
	public static void main(String[] args) {
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);

		Point p1 = new Point(5,6);
		Point p2 = new Point(6,5);
		Line l2 = new Line(p1, p2);
		System.out.println(l2);
		System.out.println(l2.getGradient());
		System.out.println(l2.getLength());

		l2.setBeginXY(5, 6);
		System.out.println(l2);

		System.out.println(l2.getBegin());
	}
}
