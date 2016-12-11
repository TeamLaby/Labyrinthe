package model.plateau;

import java.awt.Color;

import model.data.Objet;
import model.enumeration.EnumTypeSalle;
import model.personnage.Personnage;
import controler.Main;

public abstract class Salle implements Case {

	private final int x, y;
	private Color color;
	protected final Main f;
	private Objet objet;
	private final EnumTypeSalle type;

	public Salle(int x, int y, Color color, Main f, Objet objet, EnumTypeSalle type) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.f = f;
		this.objet = objet;
		this.type = type;
	}

	public abstract void recoit(Personnage p);
	public abstract void applique(Personnage p);

	public void dessiner() {
		f.fill(color.getRGB()); // pinceau: couleur de la salle
		f.rect(Main.getBordure() + (x * Main.getTaille()), Main.getBordure() + (y * Main.getTaille()), Main.getTaille(), Main.getTaille());
	}

	public float distance(Salle s) {
		return Main.sqrt(((s.x - x) * (s.x - x)) + ((s.y - y) * (s.y - y)));
	}

	public void dessinerEclairee(float distance) {
		if (distance <= 10) {
			this.dessiner();
		}
	}

	public boolean adjacente(Salle s) {
		// cas : s est à droite
		if ((this.x == s.x - 1) && (this.y == s.y)) {
			return true;
		}
		// cas : s est à gauche
		if ((this.x == s.x + 1) && (this.y == s.y)) {
			return true;
		}
		// cas : s est au dessus
		if ((this.x == s.x) && (this.y == s.y - 1)) {
			return true;
		}
		// cas : s est au dessous
		if ((this.x == s.x) && (this.y == s.y + 1)) {
			return true;
		}
		// autre cas: pas adjacente
		return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Color getColor() {
		return color;
	}

	public final void setColor(Color color) {
		this.color = color;
	}

	public Objet getObjet() {
		return objet;
	}

	public final void setObjet(Objet objet) {
		this.objet = objet;
	}

	/**
	 * @return the type
	 */
	public EnumTypeSalle getType() {
		return type;
	}

}
