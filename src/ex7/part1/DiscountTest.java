package ex7.part1;

import java.util.Date;

public class DiscountTest {
	public static void main(String[] args) {
		Visit v = new Visit("Thomas", new Date());
		v.setProductExpense(10);
		v.setServiceExpense(20);
		System.out.println(v.getTotalExpense());
	}
}
