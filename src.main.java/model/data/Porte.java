package model.data;

import model.personnage.Personnage;
import model.plateau.Case;

public class Porte extends Objet {

	private final Cle cle;

	public Porte(Cle cle) {
		this.cle = cle;
	}

	@Override
	public void applique() {
		final Case caseSuivante = determinerCaseSuivante();
		deplaceLeJoueur(caseSuivante);
	}


	public void recoit(Personnage p) {

		// parcours la liste des objets du joueur
		for (final Objet o : p.getObjets()) {
			if (o.equals(cle)) {
				applique();
				break;
			}
		}

	}

	private Case determinerCaseSuivante() {
		// final Case caseSuivante = new Case();

		return null;
	}
	private void deplaceLeJoueur(Case caseSuivante) {
		// TODO Auto-generated method stub
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

	}

}
