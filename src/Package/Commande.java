package Package;

import Enumerateur.Produit;

public class Commande extends Materiel {
	private String typeObjet;
	private int nombreObjet;
	private float prix, gain;
	private int numeroCommande, stock;
	private Produit [] produit = Produit.values();
	private int indiceProduit;
	private Materiel materiel = new Materiel();
	
	public Commande() {
		super();
		//this.typeObjet = typeObjet;
		//this.nombreObjet = nombreObjet;
		for (int i = 0; i < 9; i++) {
			if(typeObjet == produit[i].getNom()) {
				prix = produit[i].getPrix();
				indiceProduit = i;
			}
		}
		this.stock = 10;
		this.numeroCommande = (int) Math.random();
	}
	
	public void setTypeObjet(String typeObjet) {
		this.typeObjet = typeObjet;
	}

	public void setNombreObjet(int nombreObjet) {
		this.nombreObjet = nombreObjet;
	}

	public int getNombreObjet() {
		return nombreObjet;
	}
	
	public String getTypeObjet() {
		return typeObjet;
	}

	public float getPrix() {
		return prix;
	}

	public int getNumeroCommande() {
		return numeroCommande;
	}

	public int getStock() {
		return stock;
	}
	
	public int getIndiceProduit() {
		return indiceProduit;
	}
	
	public void creationObjet(int commandeStock) {
		if (commandeStock > this.stock) {
			System.out.println("Création de l'objet commandé !");
			while(this.stock != commandeStock && materiel.possedeMateriel(produit[indiceProduit].getMaterielNecessaire())) {
				this.stock ++;
				materiel.utiliserMateriel(produit[indiceProduit].getMaterielNecessaire());
			}
		}
		else if (commandeStock == this.stock) {
			this.stock = 0;
		}
		else if (this.stock > commandeStock) {
			this.stock -= commandeStock;
		}
	}
	
	public float coutCommande(int indiceObjet) {
		gain += produit[indiceObjet].getPrix() * nombreObjet;
		return gain;
	}
	
}
