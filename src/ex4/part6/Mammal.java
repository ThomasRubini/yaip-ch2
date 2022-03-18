package ex4.part6;

// I should make it abstract but UML doesn't say so
public class Mammal extends Animal {
	public Mammal(String name){
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal[%s]".formatted(super.toString());
	}

	/*
		I should maybe declare an abstract greets() method
		here or in Animal but UML doesn't say so
	 */
}
