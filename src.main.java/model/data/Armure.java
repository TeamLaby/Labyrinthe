package model.data;

import java.util.List;

import model.enumeration.EnumTypeArmure;
import model.personnage.Personnage;

public class Armure extends Objet {

	private final int resistance;

	public Armure(EnumTypeArmure typeArmure) {
		super(typeArmure.toString());
		this.resistance = typeArmure.getResistance();
	}

	@Override
	public void applique(Personnage p) {
		// TODO Auto-generated method stub
		p.getVie();
	}

	@Override
	public void recoit(Personnage p) {
		if (!isEquipe(p.getObjets())) {
			p.getObjets().add(this);
			applique(p);
		}
	}

	private boolean isEquipe(List<Objet> listeObjet) {
		boolean equipe = false;

		for (final Objet o : listeObjet) {
			if (o.getNom().equals(this.getNom())) {
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
