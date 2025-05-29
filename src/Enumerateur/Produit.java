package Enumerateur;

public enum Produit {
	FIGURINE("Figurine", 15.5f, new String[] {"Fimo", "Scalpel", "Gants", "Aluminium", "Gel"}), 
	COLLIER("Collier", 10.0f, new String[] {"Fimo", "Scalpel", "Fil", "Colle"}),
	BOUCLE("Boucle d'oreille", 8.0f, new String[] {"Fimo", "Scalpel", "Accroche", "Colle"}),
	COURONNE("Couronne Noël", 12.3f, new String[] {"Fimo", "Couronne", "Colle"}),
	MAPIENIATURE("MapieNiature", 5.5f, new String[] {"Fimo", "Scalpel", "Gants", "Aluminium", "Gel"}),
	VASE("Vase décorer", 5.1f, new String[] {"Fimo", "Vase", "Colle"}),
	SUJET("Petit personnage", 3.0f, new String[] {"Fimo", "Scalpel", "Gants", "Aluminium", "Gel"}),
	BROCHE("Broche", 16.0f, new String[] {"Fimo", "Scalpel", "Gants"}),
	DECORATION("Autres decorations", 15.0f, new String[] {"Fimo", "Scalpel", "Gants", "Aluminium", "Gel"});
	
	private String nom;
	private float prix;
	private String[] materielNecessaire;
	
	private Produit(String nom, float prix, String[] materiel) {
		this.nom = nom;
		this.prix = prix;
		this.materielNecessaire = materiel;
	}

	public String getNom() {
		return nom;
	}
	
	public float getPrix() {
		return prix;
	}
	
	public String [] getMaterielNecessaire() {
		return materielNecessaire;
	}

}
