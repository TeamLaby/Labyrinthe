package controler;

import model.personnage.Personnage;
import model.plateau.Labyrinthe;
import model.plateau.Salle;

public class Controller {

	private final Labyrinthe laby;
	private final Personnage heros;
	private final Main f;

	public Controller(Labyrinthe laby, Personnage heros, Main f) {
		this.laby = laby;
		this.heros = heros;
		this.f = f;
	}

	public void controleur() {

		if (f.keyPressed) {
			if (f.key == 'm') {
				heros.aller(laby.sortie);
			}
			final Salle position = heros.getSalleCourante();
			final int x = position.getX();
			final int y = position.getY();

			// mise a jour de peutSe Deplacer pour le heros
			heros.setPeutSeDeplacer((heros.getXpix() == heros.getXpixCible()) && (heros.getYpix() == heros.getYpixCible()));
			// si le heros peut se deplacer, on gère son déplacement
			if (heros.isPeutSeDeplacer()) {
				for (final Salle s : laby.getSalles()) { // pour toutes les salles s du labyrinthe
					if (s.adjacente(position)) {
						s.recoit(heros);
						if (this.isPeutSeDeplacer(x, y, s) && heros.isPeutSeDeplacer()) {
							heros.aller(s);
							break;
						}
					}
				}
			}
		}
	}

	private Boolean isPeutSeDeplacer(final int x, final int y, final Salle s) {
		Boolean deplacer = false;
		// s est une salle adjacente a la position
		// vers le bas
		if (f.key == 's') {
			if (s.getY() == y + 1) {
				deplacer = true;
			}
		}
		// vers le haut
		if (f.key == 'z') {
			if (s.getY() == y - 1) {
				deplacer = true;
			}
		}
		// vers la droite
		if (f.key == 'd') {
			if (s.getX() == x + 1) {
				deplacer = true;
			}
		}
		// vers la gauche
		if (f.key == 'q') {
			if (s.getX() == x - 1) {
				deplacer = true;
			}
		}
		return deplacer;
	}
}