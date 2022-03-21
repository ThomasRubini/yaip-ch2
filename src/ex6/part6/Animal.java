package ex6.part6;

public abstract class Animal {
	private final String name;

	public Animal(String name){
		this.name = name;
	}

	public abstract void greets();
}
