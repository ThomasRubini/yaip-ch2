package forFun.iut;

public class Module {
	private final String name;
	private final Professeur prof;
	private int hParSemaines;

	public Module(String name, Professeur prof, int hParSemaines) {
		this.name = name;
		this.prof = prof;
		this.hParSemaines = hParSemaines;
	}

	public String getName() {
		return name;
	}

	public Professeur getProf() {
		return prof;
	}

	public int gethParSemaines() {
		return hParSemaines;
	}

	public void sethParSemaines(int hParSemaines) {
		this.hParSemaines = hParSemaines;
	}

	@Override
	public String toString() {
		return "Module[name=%s,hParSemaines=%s,prof=%s]".formatted(name, hParSemaines, prof);
	}
}
