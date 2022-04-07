package forFun.permis;

public class PermisCategorie {
	private CategorieVehicule catVehicule;
	private String date;

	public PermisCategorie(CategorieVehicule cat, String date) {
		this.catVehicule = cat;
		this.date = date;
	}

	public CategorieVehicule getCatVehicule() {
		return catVehicule;
	}

	public void setCatVehicule(CategorieVehicule catVehicule) {
		this.catVehicule = catVehicule;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "%s (%s)".formatted(catVehicule.getCode(), date);
	}
}
