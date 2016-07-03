package model.personnage;

import java.util.List;

import model.data.Objet;
import model.data.Vie;
import model.plateau.Salle;

import com.google.common.collect.Lists;

import controler.Main;

public class Personnage {

	private final Vie vie;
	private final List<Objet> objets;

	Salle salleCourante; // salle contenant le héros

	// coordonnées graphiques
	int xpix;
	int ypix;
	int xpixCible; // coordonnees graphiques cible
	int ypixCible;
	boolean peutSeDeplacer = false;

	public Personnage(Salle depart) {
		aller(depart);
		this.xpix = xpixCible;
		this.ypix = ypixCible;
		this.objets = Lists.newArrayList();
		this.vie = new Vie(100);
	}

	public void aller(Salle destination) {
		salleCourante = destination;
		xpixCible = Main.getBordure() + (salleCourante.getX() * Main.getTaille());
		ypixCible = Main.getBordure() + (salleCourante.getY() * Main.getTaille());
	}

	public void dessiner(Main f) {
		// maj de xpix et de ypix
		if (xpix < xpixCible) {
			xpix++;
		}
		if (xpix > xpixCible) {
			xpix--;
		}
		if (ypix < ypixCible) {
			ypix++;
		}
		if (ypix > ypixCible) {
			ypix--;
		}
		f.fill(0, 0, 255); // bleu
		f.rect(xpix, ypix, Main.getTaille(), Main.getTaille());
	}

	public Vie getVie() {
		return vie;
	}

	public List<Objet> getObjets() {
		return objets;
	}

	public final Salle getSalleCourante() {
		return salleCourante;
	}

	public final void setPeutSeDeplacer(boolean peutSeDeplacer) {
		this.peutSeDeplacer = peutSeDeplacer;
	}

	public final boolean isPeutSeDeplacer() {
		return peutSeDeplacer;
	}

	public final int getXpix() {
		return xpix;
	}

	public final int getYpix() {
		return ypix;
	}

	public final int getXpixCible() {
		return xpixCible;
	}

	public final int getYpixCible() {
		return ypixCible;
	}

}
