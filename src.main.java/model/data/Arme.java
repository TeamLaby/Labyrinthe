package model.data;

import java.util.List;

import model.enumeration.EnumTypeArme;
import model.personnage.Personnage;

public class Arme extends Objet {

	private final EnumTypeArme nomArme;
	private final int degat;

	public Arme(EnumTypeArme arme) {
		super(arme.toString());
		this.nomArme = arme;
		this.degat = arme.getDegats();
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub

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

}
