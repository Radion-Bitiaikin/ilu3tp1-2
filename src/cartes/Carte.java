package cartes;

public abstract class Carte {

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Carte carte && this.toString()!=null && this.toString().equals(obj.toString());
	}

}
