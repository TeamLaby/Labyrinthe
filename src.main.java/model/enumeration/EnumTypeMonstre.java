package model.enumeration;

public enum EnumTypeMonstre {
	SMALL(10), MEDIUM(20), STRONG(30);

	private int force;

	EnumTypeMonstre(int force) {
		this.force = force;
	}

	public int getForce() {
		return force;
	}

}
