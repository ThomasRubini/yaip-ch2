package ex2.part2;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	public Book(String name, Author[] authors, double price) {
		this(name, authors, price, 0);
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Author a : authors){
			sb.append(",").append(a);
		}
		return "Book[name=%s,authors={%s},price=%s,qty=%s]".formatted(name, sb.substring(1), price, qty);
	}

	public String getAuthorNames(){
		StringBuilder sb = new StringBuilder();
		for(Author a : authors){
			sb.append(",").append(a);
		}
		return sb.substring(1);
	}

}
