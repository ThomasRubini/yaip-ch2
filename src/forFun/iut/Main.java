package forFun.iut;

/*
Consigne :
Modéliser en Java la situation suivante :
chaque étudiant d'un IUT peut choisir des modules au choix. Chaque module possède un nombre d'heures/semaine et un professeur enseignant.
Contraintes :
- On veut pouvoir connaitre le nombre d'heures qu'un étudiant à par semaine (en additionnant les heures des modules de cet étudiant)
- un étudiant possède un email qui peut être déterminée automatiquement via son nom et son prénom
Un professeur à une spécialité, qui peut être informatique, maths, communication ou économie

Faire un main pour tester un peu tout ca
 */

public class Main {

    public static void main(String[] args){
        Etudiant et1 = new Etudiant("Thomas", "Rubini");
        Etudiant et2 = new Etudiant("Djalim", "Simaila");

        Professeur prof1 = new Professeur("Casali", "Alain", ProfSpe.INFORMATIQUE);
        Professeur prof2 = new Professeur("Jean-Philippe", "Prost", ProfSpe.INFORMATIQUE);
        Professeur prof3 = new Professeur("Anni", "", ProfSpe.MATHS);
        Professeur prof4 = new Professeur("Makssoud", "", ProfSpe.ECONOMIE);

        Module m1 = new Module("C++", prof1, 4);
        Module m2 = new Module("Java", prof2, 4);
        Module m3 = new Module("Maths discrètes", prof3, 2);
        Module m4 = new Module("Graphes", prof3, 3);
        Module m5 = new Module("Droit", prof4, 0);

        et1.addModule(m1);
        et1.addModule(m2);
        et1.addModule(m5);

        et2.addModule(m1);
        et2.addModule(m2);
        et2.addModule(m3);
        et2.addModule(m4);


        System.out.println(et1);
        System.out.println(m1);
        System.out.println(prof1);
        System.out.println(et1.getEmail());
        System.out.println(et1.getHours());
        for(Module m : et1.getModules()){
            System.out.println(m.getName());
        }
    }
}
