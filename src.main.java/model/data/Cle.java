package model.data;

import model.personnage.Personnage;

public class Cle extends Objet {

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
