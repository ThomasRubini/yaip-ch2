package ex2.part5;

public class Account {
	public int id;
	private Customer customer;
	private double balance;

	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, Customer customer){
		this(id, customer, 0);
	}

	public int getID() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "%s balance=%.2f$".formatted(customer, balance);
	}

	public String getCustomerName(){
		return getCustomer().getName();
	}

	public Account deposit(double amount){
		balance += amount;

		return this;
	}

	public Account withdraw(double amount){
		if(balance >= amount){
			balance -= amount;
		}else{
			System.out.println("amount withdraw exceeds the current balance!");
		}

		return this;
	}


}
