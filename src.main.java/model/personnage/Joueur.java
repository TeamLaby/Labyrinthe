package model.personnage;

public class Joueur extends Personnage {

	private final String nom;

	public Joueur() {
		super();
		this.nom = "Bob";
	}

	public String getNom() {
		return nom;
	}

}
