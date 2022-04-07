package forFun.permis;

import java.util.List;

public class Permis {

	private final List<PermisCategorie> categories;
	private final int id;
	private int points;
	private final Personne detenteur;

	public Permis(List<PermisCategorie> categories, int id, int points, Personne detenteur) {
		this.categories = categories;
		this.id = id;
		this.points = points;
		this.detenteur = detenteur;
	}

	public List<PermisCategorie> getCategories() {
		return categories;
	}

	public int getId() {
		return id;
	}

	public int getPoints() {
		return points;
	}

	public Personne getDetenteur() {
		return detenteur;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {

		// flemme lol
		StringBuilder sb = new StringBuilder();
		sb.append("Permis N°100014");
		sb.append("\nTitulaire : ").append(detenteur);
		sb.append("\nCatégorie(s) :");
		for (PermisCategorie permisCat : categories) {
			sb.append("\n").append(permisCat);
		}
		sb.append("\nNombre de points : ").append(points);

		return sb.toString();
	}
}
