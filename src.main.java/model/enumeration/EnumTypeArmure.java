package model.enumeration;

public enum EnumTypeArmure {
	LIGHT(10), MEDIUM(20), HEAVY(30);

	private int resistance;

	EnumTypeArmure(int resistance) {
		this.resistance = resistance;
	}

	public int getResistance() {
		return resistance;
	}

}
