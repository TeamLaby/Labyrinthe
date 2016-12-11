package model.plateau;

import java.awt.Color;
import java.util.ArrayList;

import model.data.Arme;
import model.data.Cle;
import model.enumeration.EnumTypeArme;
import model.enumeration.EnumTypeObjet;
import model.enumeration.EnumTypeSalle;
import model.personnage.Personnage;
import controler.Main;

public class Labyrinthe {

	// labyrinthe : contient l'ensemble des salles
	ArrayList<Salle> salles;
	String[] lignes;
	public Salle entree;
	public Salle sortie;
	private final Main f;

	// constructeur
	public Labyrinthe(String[] lignes, Main f) {
		// initialisation de la collection des salles
		this.salles = new ArrayList<Salle>();
		this.lignes = lignes;
		this.f = f;
	}

	// création des salles
	public void load() {

		// entree
		String[] coord = lignes[1].split(" ");
		final int xentree = Integer.parseInt(coord[0]);
		final int yentree = Integer.parseInt(coord[1]);
		entree = new Standard(xentree, yentree, new Color(Color.GREEN.getRGB()), f, null, EnumTypeSalle.STANDARD);
		salles.add(entree);

		// sortie
		coord = lignes[2].split(" ");
		final int xsortie = Integer.parseInt(coord[0]);
		final int ysortie = Integer.parseInt(coord[1]);
		sortie = new Standard(xsortie, ysortie, new Color(Color.RED.getRGB()), f, null, EnumTypeSalle.STANDARD);
		salles.add(sortie);

		// autres salles
		for (int i = 3; i < lignes.length; i++) {
			final String[] coordonnees = lignes[i].split(" ");
			final int x = Integer.parseInt(coordonnees[0]);
			final int y = Integer.parseInt(coordonnees[1]);
			Salle s = null;
			if (coordonnees.length > 2 && coordonnees[2] != null) {
				final String initialeObjet = coordonnees[2];
				// Si c'est une porte
				if (initialeObjet.equals(EnumTypeObjet.PORTE.getInitiale())) {
					s = new Porte(x, y, new Color(Color.ORANGE.getRGB()), f, new Cle(), EnumTypeSalle.PORTE);
				}
				// Si c'est une clé
				else if (initialeObjet.equals(EnumTypeObjet.CLE.getInitiale())) {
					for (final Salle p : salles) {
						if (p.getType().equals(EnumTypeSalle.PORTE)) {
							s = new Standard(x, y, new Color(Color.PINK.getRGB()), f, p.getObjet(), EnumTypeSalle.STANDARD);
							break;
						}
					}
				}
				// Si c'est une arme
				else if (initialeObjet.equals(EnumTypeObjet.ARME.getInitiale())) {
					s = new Standard(x, y, new Color(Color.MAGENTA.getRGB()), f, new Arme(EnumTypeArme.EPEE), EnumTypeSalle.STANDARD);
				}
			} else {
				s = new Standard(x, y, new Color(Color.WHITE.getRGB()), f, null, EnumTypeSalle.STANDARD);
			}

			salles.add(s);
		}

	}

	public void dessiner(Salle herosSalleCourante, Personnage heros) {
		// on demande a chaque salle de se dessiner
		for (final Salle s : salles) {
			s.dessinerEclairee(s.distance(herosSalleCourante));
		}
	}
	public final ArrayList<Salle> getSalles() {
		return salles;
	}

	public final Salle getEntree() {
		return entree;
	}
}
