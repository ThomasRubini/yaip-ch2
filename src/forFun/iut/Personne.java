package forFun.iut;

public abstract class Personne {

	private static int nextID = 0;

	private final int id;
	private final String surname;
	private final String lastname;

	public Personne(String surname, String lastname) {
		this.id = nextID++;
		this.surname = surname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getName(){
		return surname+" "+lastname;
	}

	public abstract String getEmail();

	@Override
	public String toString() {
		return "Personne[id=%s,surname=%s,lastname=%s]".formatted(id, surname, lastname);
	}


	@Override
	public boolean equals(Object o){
		if(o instanceof Personne another){
			return another.id == id;
		}else return false;
	}

}
