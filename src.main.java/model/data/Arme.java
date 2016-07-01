package model.data;

import java.util.List;

import model.personnage.Personnage;

public class Arme extends Objet {

	private final String nom;
	private final int degat;

	public Arme() {
		this.nom = "épee";
		this.degat = 10;
	}

	@Override
	public void applique() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recoit(Personnage p) {
		if (!isEquipe(p.getObjets())) {
			p.getObjets().add(this);
		}
	}

	private boolean isEquipe(List<Objet> listeObjet) {
		boolean equipe = false;

		for (final Objet o : listeObjet) {
			if (o.getNom().equals(this.nom)) {
				equipe = true;
				break;
			}
		}
		return equipe;
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub
		
	}
}
