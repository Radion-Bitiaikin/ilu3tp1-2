package jeu;

import cartes.Carte;
import java.lang.IllegalStateException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sabot implements Iterable<Carte> {

	private Carte cartes[];
	private int nbCartes = 106;
	private int nbOp = 0;

	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
	}

	public boolean estVide() {
		return nbCartes==0;
	}

	public void ajouterCarte(Carte carte) {
		if(nbCartes==106) throw new RuntimeException();

		cartes[nbCartes++] = carte;
	}

	public Carte piocher() {

		Carte c;
		Iterator<Carte> iter = iterator();
		c = iter.next();
		iter.remove();
		return c;

	}

	@Override
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	private class Iterateur implements Iterator<Carte> {

		private int i = 0;
		private int opRef = nbOp;

		public boolean hasNext()
		{
			return i<nbCartes;
		}

		public Carte next()
		{
			if(i>=nbCartes) throw new NoSuchElementException();
			return cartes[i++];
		}

		public void remove()
		{
			if(opRef!=nbOp) throw new ConcurrentModificationException();
			opRef++;
			nbOp++;
			if(i>nbCartes || 0>=i) throw new IllegalStateException();
			nbCartes--;
			for(int j=i-1; j<nbCartes; j++) cartes[j]=cartes[j+1];
		}

	}

}