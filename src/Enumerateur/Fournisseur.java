package Enumerateur;

public enum Fournisseur {
	FIMO("Fimo", 5.0f, 50),
	SCALPEL("Scalpel Pro", 10.0f, 2),
	GANT("Gants sans latex", 15.0f, 30),
	COLLE("Colle chaude", 5.0f, 2),
	ALUMINIUM("Aluminium", 1.0f, 1),
	GEL("Gel hydroalcoolique", 11.5f, 2),
	COURONNE("Lots de couronne", 10.2f, 60),
	FIL("Fil étirable", 4.5f, 2),
	ACCROCHE("Accroche en argent", 23.5f, 100),
	VASE("Vase en verre", 12.4f, 10);
	
	private String nom;
	private float prix;
	private int stock;
	
	private Fournisseur(String nom, float prix, int stock) {
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
	}
	
	public String getNom() {
		return nom;
	}
	
	public float getPrix() {
		return prix;
	}
	
	public int getStock() {
		return stock;
	}
}
