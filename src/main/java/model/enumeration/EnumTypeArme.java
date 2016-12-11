package model.enumeration;

public enum EnumTypeArme {
	EPEE(10), HACHE(20), MASSE(30);

	private int degats;

	EnumTypeArme(int degats) {
		this.degats = degats;
	}

	public int getDegats() {
		return degats;
	}
}
