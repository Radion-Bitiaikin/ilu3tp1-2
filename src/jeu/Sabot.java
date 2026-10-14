package jeu;

public class Sabot {

	private Carte cartes[];
	private int nbCartes = 110;

	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
	}

	public Bool estVide() {
		return nbCartes==0;
	}

	public void ajouterCarte(Carte carte) {
		if(nbCartes==110); //EXCEPTION

		cartes[nbCartes++] = carte;
	}

}