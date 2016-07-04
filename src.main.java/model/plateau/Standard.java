package model.plateau;

import java.awt.Color;

import model.data.Objet;
import model.enumeration.EnumTypeSalle;
import model.personnage.Personnage;
import controler.Main;

public class Standard extends Salle implements Case {

	public Standard(int x, int y, Color color, Main f, Objet o, EnumTypeSalle type) {
		super(x, y, color, f, o, type);
	}

	@Override
	public void recoit(Personnage p) {
		p.setPeutSeDeplacer(true);
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

	}

}
