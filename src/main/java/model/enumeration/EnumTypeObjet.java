package model.enumeration;

public enum EnumTypeObjet {
	CLE("C"), MONSTRE("M"), PORTE("P"), ARME("A"), ARMURE("D"), TELEPORTEUR("T");

	private String initiale;

	EnumTypeObjet(String initiale) {
		this.initiale = initiale;
	}

	public String getInitiale() {
		return initiale;
	}
}
