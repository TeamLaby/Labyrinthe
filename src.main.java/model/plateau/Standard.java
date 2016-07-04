package model.plateau;

import java.awt.Color;

import model.personnage.Personnage;
import controler.Main;

public class Standard extends Salle implements Case {

	public Standard(int x, int y, Color color, Main f) {
		super(x, y, color, f);
	}

	@Override
	public void recoit(Personnage p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

	}

}
