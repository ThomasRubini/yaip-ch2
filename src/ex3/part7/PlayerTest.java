package ex3.part7;

public class PlayerTest {
	public static void main(String[] args) {
		Player p = new Player(1, 5, 5);
		Ball b = new Ball(100, 100, 0);
		System.out.println(p.near(b));
		p.move(90, 90);
		System.out.println(p.near(b));

		System.out.println("Kicking !");
		System.out.println(b);
		p.kick(b);
		System.out.println(b);
	}
}
