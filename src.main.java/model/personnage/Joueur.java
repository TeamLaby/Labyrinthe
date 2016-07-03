package model.personnage;

import model.plateau.Salle;

public class Joueur extends Personnage {

	private final String nom;

	public Joueur(String nom, Salle depart) {
		super(depart);
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
