package Package;

public class Comptage extends Commande {
	
	private float sommeFinal = 0.0f;
	private Materiel materiel = new Materiel();
	
	public Comptage() {
		super();
	}
	
	public float recette(float sommeDepart, float prixCommandeClient, float prixCommandeFournisseur) {
		sommeFinal = (sommeDepart + prixCommandeClient) - prixCommandeFournisseur;
		return sommeFinal;
	}
	
	public void releverFinMois(float sommeDepart, float prixCommandeClient) {
		float prixCommandeFournisseur = materiel.acheterAuxFournisseurs(super.getTypeObjet(), super.getIndiceProduit());
		System.out.println("Vous avez " + recette(sommeDepart, prixCommandeClient, prixCommandeFournisseur)
							+ "€ pour ce mois-ci.");
	}
}
