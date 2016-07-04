package model.plateau;

import java.awt.Color;

import model.data.Cle;
import model.data.Objet;
import model.personnage.Personnage;
import controler.Main;

public class Porte extends Salle implements Case {

	private final Cle cle;

	public Porte(int x, int y, Color color, Main f) {
		super(x, y, color, f);
		cle = new Cle();
	}

	@Override
	public void recoit(Personnage p) {
		// par defaut
		p.setPeutSeDeplacer(false);
		// parcours de la liste des objets
		for (final Objet o : p.getObjets()) {
			// si le heros possède la cle
			if (o.equals(getCle())) {
				p.setPeutSeDeplacer(true);
				break;
			}
		}
		applique(p);
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

	}

	public Cle getCle() {
		return cle;
	}

}
