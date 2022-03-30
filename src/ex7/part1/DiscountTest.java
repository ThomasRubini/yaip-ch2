package ex7.part1;

import java.util.Date;

public class DiscountTest {
	public static void main(String[] args) {
		Visit v = new Visit("Thomas", new Date());
		System.out.println(v.getTotalExpense());
	}
}
