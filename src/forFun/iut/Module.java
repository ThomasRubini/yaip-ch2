package forFun.iut;

public class Module {
	private final String name;
	private final Professeur prof;
	private int hParSemaine;

	public Module(String name, Professeur prof, int hParSemaine) {
		this.name = name;
		this.prof = prof;
		this.hParSemaine = hParSemaine;
	}

	public String getName() {
		return name;
	}

	public Professeur getProf() {
		return prof;
	}

	public int getHParSemaine() {
		return hParSemaine;
	}

	public void sethParSemaine(int hParSemaine) {
		this.hParSemaine = hParSemaine;
	}

	@Override
	public String toString() {
		return "Module[name=%s,hParSemaines=%s,prof=%s]".formatted(name, hParSemaine, prof);
	}
}
