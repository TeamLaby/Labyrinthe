package model.plateau;

import java.awt.Color;
import java.util.ArrayList;

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

	// cr�ation des salles
	public void load() {
		// entree
		String[] coord = lignes[1].split(" ");
		final int xentree = Integer.parseInt(coord[0]);
		final int yentree = Integer.parseInt(coord[1]);
		entree = new Salle(xentree, yentree, new Color(Color.GREEN.getRGB()), f);
		salles.add(entree);
		// sortie
		coord = lignes[2].split(" ");
		final int xsortie = Integer.parseInt(coord[0]);
		final int ysortie = Integer.parseInt(coord[1]);
		sortie = new Salle(xsortie, ysortie, new Color(Color.RED.getRGB()), f);
		salles.add(sortie);
		// autres salles
		for (int i = 3; i < lignes.length; i++) {
			final String[] coordonnees = lignes[i].split(" ");
			final int x = Integer.parseInt(coordonnees[0]);
			final int y = Integer.parseInt(coordonnees[1]);
			final Salle s = new Salle(x, y, new Color(Color.WHITE.getRGB()), f);
			salles.add(s);
		}

	}

	public void dessiner(Salle herosSalleCourante) {
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
