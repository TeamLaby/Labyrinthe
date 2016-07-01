package model.personnage;

import java.util.List;

import model.data.Objet;
import model.data.Vie;

import com.google.common.collect.Lists;

public class Personnage {

	private final Vie vie;
	private final List<Objet> objets;

	public Personnage() {
		this.objets = Lists.newArrayList();
		this.vie = new Vie(100);
	}

	public Vie getVie() {
		return vie;
	}

	public List<Objet> getObjets() {
		return objets;
	}
}
