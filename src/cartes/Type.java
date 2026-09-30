package cartes;

public enum Type {
	FEU("FEU ROUGE","FEU VERT","VEHICULE PRIORITAIRE"),
	ESSENCE("PANNE D'ESSENCE","ESSENCE","CITERNE D'ESSENCE"),
	CREVAISON("CREVAISON","ROUE DE SECOURS","INCREVABLE"),
	ACCIDENT("ACCIDENT","REPARATIONS","AS DU VOLANT");
	
	private final String affichageAttaque;
	private final String affichageParade;
	private final String affichageBotte;
	
	Type(String affichageAttaque, String affichageParade, String affichageBotte) {
		this.affichageAttaque = affichageAttaque;
		this.affichageParade = affichageParade;
		this.affichageBotte = affichageBotte;
		
	}
	
	public String getAffichageAttaque() {
		return affichageAttaque;
	}
	
	public String getAffichageParade() {
		return affichageParade;
	}
	
	public String getAffichageBotte() {
		return affichageBotte;
	}
}
