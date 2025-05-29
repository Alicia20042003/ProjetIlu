package Package;

import Enumerateur.Fournisseur;

public class Materiel {
	private String [] nom;
	private int [] stockMateriel;
	private float prixAcheter = 0.0f;
	private Fournisseur [] fournisseur = Fournisseur.values();
	
	public Materiel() {
		stockMateriel = new int[fournisseur.length];
        nom = new String[fournisseur.length];
        
		for (int i = 0; i < 10; i++) {
			this.stockMateriel[i] = fournisseur[i].getStock();
			this.nom[i] = fournisseur[i].getNom();
		}
	}

	public String[] getNom() {
		return nom;
	}

	public int[] getStockMateriel() {
		return stockMateriel;
	}
	
	public float getPrixAcheter() {
		return prixAcheter;
	}
	
	public Boolean possedeMateriel(String [] nomMat) {
		Boolean possede = true;
		int i = 0, j = 0;
		while(i < nomMat.length) {
			j = 0;
			while(j < 10 && nomMat[i] != nom[j]) {
				j++;
			}
			if(stockMateriel[j] == 0) {
				acheterAuxFournisseurs(nomMat[i], j);
				possede = false;
			}
			i++;
		}
		return possede;
	}
	
	public void utiliserMateriel(String [] nomMat) {
		int i = 0, j = 0;
		while(i < nomMat.length) {
			j = 0;
			while(j < 10 && nomMat[i] != nom[j]) {
				j++;
			}
			switch (nom[j]) {
			case "Fimo": stockMateriel[j] -= 4;
			case "Scalpel Pro": stockMateriel[j] -= 1;
			case "Gants sans latex": stockMateriel[j] -= 2;
			case "Colle chaude": stockMateriel[j] -= 1;
			case "Aluminium": stockMateriel[j] -= 1;
			case "Gel hydroalcoolique": stockMateriel[j] -= 1;
			case "Lots de couronne": stockMateriel[j] -= 1;
			case "Fil étirable": stockMateriel[j] -= 1;
			case "Accroche en argent": stockMateriel[j] -= 2;
			case "Vase en verre": stockMateriel[j] -= 1;
			}
			i++;
		}
	}
	
	public float acheterAuxFournisseurs(String nomMat, int indiceStock) {
		 prixAcheter += fournisseur[indiceStock].getPrix() * fournisseur[indiceStock].getStock();
		 stockMateriel[indiceStock] = fournisseur[indiceStock].getStock();
		 
		 return prixAcheter;
	}
	
}
