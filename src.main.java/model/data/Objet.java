package model.data;

import model.personnage.Personnage;

public abstract class Objet {

	private String nom;

	public abstract void applique();
	public abstract void recoit(Personnage p);

	public String getNom() {
		return nom;
	}
}
