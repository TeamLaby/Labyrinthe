package model.data;

public class Vie {

	private int pointsDeVie;
	private int resistance;

	public Vie(int points) {
		this.pointsDeVie = points;
		this.resistance = 0;
	}

	public void perdreVie(int degat) {
		setPointsDeVie(pointsDeVie - (degat * (1 - resistance / 100)));
	}
	public void ajouterArmure(int resistance) {
		setResistance(resistance);
	}

	public void retirerArmure() {
		setResistance(0);
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int points) {
		this.pointsDeVie = pointsDeVie - points;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
}
