package testsFonctionnels;

import cartes.Carte;
import cartes.JeuDeCartes;
import java.util.Iterator;
import jeu.Sabot;

public class TestSabot {

	public TestSabot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		JeuDeCartes jeuDeCartes = new JeuDeCartes();
		Sabot sabot;


		sabot = new Sabot(jeuDeCartes.donnerCartes());
		while(!sabot.estVide()) {
			System.out.println("je pioche " + sabot.piocher().toString());
		}
		System.out.println();


		sabot = new Sabot(jeuDeCartes.donnerCartes());
		Iterator<Carte> iter = sabot.iterator();
		while(iter.hasNext()) {
			System.out.println("je pioche " + iter.next().toString());
		}

	}

}