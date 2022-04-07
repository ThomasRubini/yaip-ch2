package forFun.permis;

public class Personne {
	private final String prenom, nom;

	// TODO make it a Date
	private final String naissance;

	public Personne(String prenom, String nom, String naissance) {
		this.prenom = prenom;
		this.nom = nom;
		this.naissance = naissance;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getNaissance() {
		return naissance;
	}

	@Override
	public String toString() {
		return "%s, %s, %s".formatted(nom.toUpperCase(), prenom, naissance);
	}
}