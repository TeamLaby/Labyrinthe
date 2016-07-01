package model.personnage;

import model.enumeration.EnumTypeMonstre;

public class Monstre extends Personnage {

	private final EnumTypeMonstre monstre;
	private final int force;

	public Monstre(EnumTypeMonstre monstre) {
		super();
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
