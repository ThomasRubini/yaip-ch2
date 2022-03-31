package ex3.part4;

public class TestMyTime {
	public static void main(String[] args) {
		MyTime t = new MyTime();
		System.out.println(t.nextMinute().previousSecond().nextHour().nextHour());
	}
}
