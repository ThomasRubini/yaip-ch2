package forFun.permis;

import java.util.ArrayList;

/*
Consigne :

Créer une classe Personne
- Il a pour attributs prenom nom, date de naissance
- Il a pour seul constructeur, les 3 attributs prenom/nom, date de naissance
- Il n'a pas de setter, uniquement des getters.

Créer une classe Permis
- Il a pour attributs une liste de PermisCategorie, un numéro de permis, un nombre de points et une Personne
- Il a pour seul constructeur, les 4 attributs.
- Il n'a pas de setter sauf pour nombre de points
- Il a tous les getters

Créer une classe PermisCategorie
- Il a pour attribut CategorieVehicule, DateDeReussite

Créer une enum CategorieVehicule
- L'enum a pour attributs name, code
- La liste des valeurs : ("Moto", "A"), ("Voiture", "B"), ("Camion", "C"), ("Bateau", "Y")

Le Main :
 Nouvelle personne ("Albert", "Brenaman", "01/01/1980")
 Il réussit son permis Moto le 1 janvier 2022, on lui décerne un permis complet n° 100014
 Il passe son permis Voiture et le réussit le 1 mars 2022
 Afficher son permis

- Faire la méthode toString de Permis respectant l'affichage suivant :

 "Permis N° 100014
 Titulaire : BRENAMAN, Albert, 01/01/1980
 Catégorie(s) :
 A (01/01/2022)
 B (01/03/2022)
 Nombre de points : 12"
 */

public class Main {
	public static void main(String[] args) {
		Personne personne = new Personne("Albert", "Brenaman", "01/01/1980");

		ArrayList<PermisCategorie> list = new ArrayList<>();
		list.add(new PermisCategorie(CategorieVehicule.Moto, "01/01/2022"));
		list.add(new PermisCategorie(CategorieVehicule.Voiture, "01/03/2022"));

		Permis permis = new Permis(
				list,
				100014,
				12,
				personne
		);

		System.out.println(permis);
	}
}