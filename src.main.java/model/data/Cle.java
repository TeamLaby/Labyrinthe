package model.data;

import model.enumeration.EnumTypeObjet;
import model.personnage.Personnage;

public class Cle extends Objet {

	public Cle() {
		super(EnumTypeObjet.CLE.toString());
	}

	@Override
	public void applique() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recoit(Personnage p) {
		Cle cle = new Cle();
		p.getObjets().add(cle);
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

	}

}
