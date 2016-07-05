package model.data;

import java.awt.Color;

import model.enumeration.EnumTypeSalle;
import model.personnage.Personnage;
import model.plateau.Case;
import model.plateau.Salle;
import controler.Main;

public class Teleporteur extends Salle implements Case {

	public Teleporteur(int x, int y, Color color, Main f, Objet o, EnumTypeSalle type) {
		super(x, y, color, f, o, type);
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recoit(Personnage p) {
		// TODO Auto-generated method stub

	}

}
