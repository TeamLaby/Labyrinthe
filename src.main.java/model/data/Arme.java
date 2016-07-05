package model.data;

import java.util.List;

import model.enumeration.EnumTypeArme;
import model.personnage.Personnage;

public class Arme extends Objet {

	private final EnumTypeArme nomArme;
	private final int degat;

	public Arme(EnumTypeArme arme) {
		this.nomArme = arme;
		this.degat = arme.getDegats();
	}

	@Override
	public void applique(Personnage p) {
		
		if (!isEquipe(p.getObjets())) {
			p.getObjets().add(this);
		}

	}


	public void recoit() {

	}

	private boolean isEquipe(List<Objet> listeObjet) {
		boolean equipe = false;

		for (final Objet o : listeObjet) {
			if (o.getNom().equals(this.nomArme)) {
				equipe = true;
				break;
			}
		}
		return equipe;
	}

	@Override
	public void applique() {
		// TODO Auto-generated method stub
		
	}


}
