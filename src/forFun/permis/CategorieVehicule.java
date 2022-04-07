package forFun.permis;

public enum CategorieVehicule {
	Moto("A"),
	Voiture("B"),
	Camion("C"),
	Bateau("Y"),
	;
	private final String code;

	public String getCode() {
		return code;
	}

	CategorieVehicule(String code) {
		this.code = code;
	}
}