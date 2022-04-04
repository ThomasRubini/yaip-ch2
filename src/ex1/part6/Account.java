package ex1.part6;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name){
		this(id, name, 0);
	}

	public Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount){
		balance += amount;
		return balance;
	}

	public int debit(int amount){
		if(amount <= balance){
			balance -= amount;
		}else System.out.println("Amount exceeded balance");
		return balance;
	}

	public int transferTo(Account another, int amount){
		if(amount <= balance){
			balance -= amount;
			another.balance += amount;
		}else System.out.println("Amount exceeded balance");
		return balance;
	}

	@Override
	public String toString() {
		return "Account[id=%s,name=%s,balance=%s]".formatted(id, name, balance);
	}
}
