package model.data;

import model.personnage.Personnage;

public class Cle extends Objet {

	@Override
	public void applique() {
		// TODO Auto-generated method stub

	}


	public void recoit(Personnage p) {
		
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub
		p.getObjets().add(this);
	}

}
