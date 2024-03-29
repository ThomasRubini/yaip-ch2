package ex2.part4;

public class Customer {
	private int id;
	private String name;
	private int discount;

	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "%s(%s)(%s%%)".formatted(name, id, discount);
	}
}
