package forFun.iut;

public class Professeur extends Personne {
	public ProfSpe spe;

	public Professeur(String surname, String lastname, ProfSpe spe) {
		super(surname, lastname);
		this.spe = spe;
	}

	@Override
	public String getEmail(){
		return "%s.%s@univ-amu.fr".formatted(getSurname(), getLastname());
	}

	@Override
	public String toString() {
		return "Professeur[%s,spe=%s]".formatted(super.toString(), spe);
	}
}
