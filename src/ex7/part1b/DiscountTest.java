package ex7.part1b;

import ex7.part1b.customer.Customer;
import ex7.part1b.customer.CustomerFactory;

import java.util.Date;

public class DiscountTest {
	public static void main(String[] args) {
		Customer c = CustomerFactory.getInstance().getCustomer("Thomas");
		c.setMemberType(MemberType.GOLD);

		System.out.println("First visit :");
		Visit v = new Visit(c, new Date());
		v.setProductExpense(20);
		v.setServiceExpense(40);

		System.out.println("product expense: "+v.getProductExpense());
		System.out.println("product bill: "+v.getProductBill());
		System.out.println("service expense: "+v.getServiceExpense());
		System.out.println("service bill: "+v.getServiceBill());
		System.out.println("total bill: "+v.getTotalBill());
		System.out.println(v);

		System.out.println("Second visit :");
		Visit v2 = new Visit(CustomerFactory.getInstance().getCustomer("Thomas"), new Date());
		// Should be the same customer. Let's check
		System.out.println(v2.getCustomer().getMemberType());
		v2.setProductExpense(20);
		System.out.println(v2.getProductBill());
		System.out.println(v2);

	}
}
