package model.data;

import model.personnage.Personnage;

public abstract class Objet {

	private final String nom;

	public Objet(String nom) {
		this.nom = nom;
	}

	public abstract void applique(Personnage p);

	public String getNom() {
		return nom;
	}

}
