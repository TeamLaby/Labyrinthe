package model.plateau;

import java.awt.Color;

import model.data.Cle;
import model.data.Objet;
import model.enumeration.EnumTypeSalle;
import model.personnage.Personnage;
import controler.Main;

public class Porte extends Salle implements Case {

	private final Cle cle;

	public Porte(int x, int y, Color color, Main f, Objet o, EnumTypeSalle type) {
		super(x, y, color, f, o, type);
		cle = new Cle();
	}

	@Override
	public void recoit(Personnage p) {
		// par defaut
		p.setPeutSeDeplacer(false);
		// parcours de la liste des objets
		for (final Objet o : p.getObjets()) {
			// si le heros poss�de la cle
			if (o.equals(getCle())) {
				p.setPeutSeDeplacer(true);
				applique(p);
				break;
			}
		}

	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub
		System.out.println("ouvre la porte");
	}

	public Cle getCle() {
		return cle;
	}

}
