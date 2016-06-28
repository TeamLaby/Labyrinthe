package model.data;

import model.personnage.Personnage;

public abstract class Objet {
	public abstract void applique(); 
	public abstract void recoit(Personnage p);
}
