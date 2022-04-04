package ex2.part5;

public class TestAccount {
	public static void main(String[] args) {
		Customer c = new Customer(1, "Thomas", 'm');

		System.out.println(c.getID());
		System.out.println(c.getName());
		System.out.println(c.getGender());
		System.out.println(c);

		Account acc = new Account(1, c);
		System.out.println(acc);
		acc.setBalance(100);
		acc.deposit(10);
		acc.withdraw(5);
		System.out.println(acc);

		acc.withdraw(500);
	}
}
