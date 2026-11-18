package cartes;

public class JeuDeCartes {

	private Configuration typesDeCartes[] = new Configuration[19];

	public JeuDeCartes() {
		typesDeCartes[0] = new Configuration(new Borne(25), 10);
		typesDeCartes[1] = new Configuration(new Borne(50), 10);
		typesDeCartes[2] = new Configuration(new Borne(75), 10);
		typesDeCartes[3] = new Configuration(new Borne(100), 12);
		typesDeCartes[4] = new Configuration(new Borne(200), 4);

		typesDeCartes[5] = new Configuration(new Parade(Type.FEU), 14);
		typesDeCartes[6] = new Configuration(new FinLimite(), 6);
		typesDeCartes[7] = new Configuration(new Parade(Type.ESSENCE), 6);
		typesDeCartes[8] = new Configuration(new Parade(Type.CREVAISON), 6);
		typesDeCartes[9] = new Configuration(new Parade(Type.ACCIDENT), 6);

		typesDeCartes[10] = new Configuration(new Attaque(Type.FEU), 5);
		typesDeCartes[11] = new Configuration(new DebutLimite(), 4);
		typesDeCartes[12] = new Configuration(new Attaque(Type.ESSENCE), 3);
		typesDeCartes[13] = new Configuration(new Attaque(Type.CREVAISON), 3);
		typesDeCartes[14] = new Configuration(new Attaque(Type.ACCIDENT), 3);

		typesDeCartes[15] = new Configuration(new Botte(Type.FEU), 1);
		typesDeCartes[16] = new Configuration(new Botte(Type.ESSENCE), 1);
		typesDeCartes[17] = new Configuration(new Botte(Type.CREVAISON), 1);
		typesDeCartes[18] = new Configuration(new Botte(Type.ACCIDENT), 1);
	}

	public String affichageJeuDeCartes() {

		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < 19; i++) {
			sb.append(typesDeCartes[i].getNbExemplaires() + " " + typesDeCartes[i].getCarte().toString() + "\n");
		}

		return sb.toString();
	}

	public Carte[] donnerCartes() {
		Carte cartes[] = new Carte[106];

		for (int i = 0, k = 0; i < 19; i++) {
			for (int j = 0; j < typesDeCartes[i].getNbExemplaires(); j++) {
				cartes[k] = typesDeCartes[i].getCarte();
				//System.out.println(i + " " + j + " " + k + " " + cartes[k].toString());
				k++;
			}
		}

		return cartes;
	}

	public boolean checkCount(Carte cartes[]) {
		if(null==cartes) return false;

		int n[] = new int[19];
		int j;

		for(int i=0;i<19;i++) {
			n[i] = typesDeCartes[i].getNbExemplaires();
		}

		for(int i=0;i<106;i++) {

			if(null==cartes[i]) return false;

			for(j=0;j<19;j++) {

				if(cartes[i].equals(typesDeCartes[j].getCarte())) {
					n[j]--;
					break;
				}
			}

			if(19==j) return false;
		}

		for(int i=0;i<19;i++) {
			if(0!=n[i]) return false;
		}

		return true;
	}

	private class Configuration {

		private int nbExemplaires;
		private Carte carte;

		public Configuration(Carte carte, int nbExemplaires) {
			this.nbExemplaires = nbExemplaires;
			this.carte = carte;
		}

		public Carte getCarte() {
			return carte;
		}

		public int getNbExemplaires() {
			return nbExemplaires;
		}
	}

}
