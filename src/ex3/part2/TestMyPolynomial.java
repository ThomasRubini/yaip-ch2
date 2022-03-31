package ex3.part2;

public class TestMyPolynomial {
	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3);
		System.out.println(p1);
		p1.add(p2);
		System.out.println(p1);


		MyPolynomial p3 = new MyPolynomial(1,2,3);
		MyPolynomial p4 = new MyPolynomial(1,2);
		p3.multiply(p4);
		System.out.println(p3);


		System.out.println(p2.evaluate(5));
	};
}
