package model.personnage;

public class Joueur extends Personnage {

	private final String nom;

	public Joueur(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
