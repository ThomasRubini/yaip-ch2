package forFun.iut;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {

    public List<Module> modules;

    public Etudiant(String surname, String lastname) {
        super(surname, lastname);
        this.modules = new ArrayList<>();
    }


    public void addModule(Module m){
        modules.add(m);
    }

    public List<Module> getModules() {
        return modules;
    }

    public int getHours(){
        int total = 0;
        for(Module m : modules){
            total += m.getHParSemaine();
        }
        return total;
    }

    @Override
    public String getEmail(){
        return "%s.%s@etu.univ-amu.fr".formatted(getSurname(), getLastname());
    }

    @Override
    public String toString() {
        return "Etudiant[%s,modules=%s]".formatted(super.toString(), modules);
    }
}
