package ex4.part6;

// I should make it abstract but UML doesn't say so
public class Animal {
	private final String name;

	public Animal(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal[name=\"%s\"]".formatted(name);
	}
}
