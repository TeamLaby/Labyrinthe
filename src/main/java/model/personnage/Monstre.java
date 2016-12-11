package model.personnage;

import model.enumeration.EnumTypeMonstre;
import model.plateau.Salle;

public class Monstre extends Personnage {

	private final EnumTypeMonstre monstre;
	private final int force;

	public Monstre(EnumTypeMonstre monstre, Salle depart) {
		super(depart);
		this.monstre = monstre;
		this.force = monstre.getForce();
	}

	public EnumTypeMonstre getMonstre() {
		return monstre;
	}

	public int getForce() {
		return force;
	}

}
