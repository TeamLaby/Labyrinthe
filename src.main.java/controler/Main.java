package controler;

import java.awt.Color;

import model.personnage.Personnage;
import model.plateau.Labyrinthe;
import model.plateau.Salle;
import model.plateau.Standard;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	private static final long serialVersionUID = 8172630349765623671L;

	private final static int TAILLE = 15;
	private final static int BORDURE = 10;

	String[] lignes;
	PImage mur;
	Labyrinthe laby;
	Personnage heros;
	Controller ctrl;

	@Override
	public void setup() {

		// recuperation des donnees du fichier
		lignes = loadStrings("img/level2.txt");
		final String[] dimension = split(lignes[0], " ");
		final int x = Integer.parseInt(dimension[0]);
		final int y = Integer.parseInt(dimension[1]);
		// fenetre graphique de taille adaptee au labyrinthe, fond noir
		final int largeur = (TAILLE * (x + 1)) + (2 * BORDURE);
		final int hauteur = (TAILLE * (y + 1)) + (2 * BORDURE);
		size(largeur, hauteur);
		background(0);

		// image du mur
		mur = loadImage("img/020briques.jpg");
		mur.resize(largeur - (2 * BORDURE), hauteur - (2 * BORDURE));
		image(mur, BORDURE, BORDURE);

		// initialisation du labyrinthe
		laby = new Labyrinthe(lignes, this);
		laby.load(); // chargement des salles
		// creation du héros
		heros = new Personnage(laby.getEntree());
		// creation du controller
		ctrl = new Controller(laby, heros, this);
	}

	@Override
	public void draw() {
		ctrl.controleur();
		// image de fond
		image(mur, BORDURE, BORDURE);
		// mettre en noir tout ce qui est assez loin (distance au moins 10)
		final String[] dimension = split(lignes[0], " ");
		final int largeurLaby = Integer.parseInt(dimension[0]);
		final int hauteurLaby = Integer.parseInt(dimension[1]);
		for (int i = 0; i < largeurLaby; i++) {
			for (int j = 0; j < hauteurLaby; j++) {
				final Salle z = new Standard(i, j, new Color(0), this); // Salle de coordonnees i,j en noir
				if (z.distance(heros.getSalleCourante()) > 10) {
					z.dessiner();
					z.recoit(heros);
				}
			}
		}
		laby.dessiner(heros.getSalleCourante());
		heros.dessiner(this);

	}

	public static final int getTaille() {
		return TAILLE;
	}

	public static final int getBordure() {
		return BORDURE;
	}

}
