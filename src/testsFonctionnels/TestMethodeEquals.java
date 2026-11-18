package testsFonctionnels;

import cartes.*;

public class TestMethodeEquals {

	public TestMethodeEquals() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Carte b1 = new Borne(25);
		Carte b2 = new Borne(25);
		Carte a1 = new Attaque(Type.FEU);
		Carte a2 = new Attaque(Type.FEU);
		Carte p1 = new Parade(Type.FEU);

		System.out.println("Deux cartes de 25km sont identiques ? " + b1.equals(b2));
		System.out.println("Deux cartes de feux rouge sont identiques ? " + a1.equals(a2));
		System.out.println("La carte feu rouge et la carte feu vert sont identiques ? " + a1.equals(p1));


	}

}