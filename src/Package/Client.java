package Package;

public class Client {
	private String nom, prenom, mail, telephone;
	private Boolean codePromo;
	private int nombreCommande;
	private float prixPayee;
	private int [] commandePasse = {};
	private String [] codePromoDonnee = {"MAPIE09", "RECRE25", "2025MAPIE"};
	private Commande commande;
	
	public Client(String nom, String prenom, String mail, String telephone, Boolean codePromo, String nomCommande) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.codePromo = codePromo;
		this.nombreCommande = 0;
		
		commande = new Commande();
		commande.setTypeObjet(nomCommande);
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getMail() {
		return mail;
	}

	public String getTelephone() {
		return telephone;
	}
	
	public int getNombreCommande() {
		return nombreCommande;
	}

	public int[] getCommandePasse() {
		return commandePasse;
	}
	
	public float getPrixPayee() {
		return prixPayee;
	}

	public float passerCommande(String nomObjet, String code, int nombreObjet) {

		commande.setNombreObjet(nombreObjet);
		float reduction = 0.0f;
		if(this.codePromo) {
			reduction = utiliserCodePromo(code);
		}
		
		prixPayee = commande.coutCommande(commande.getIndiceProduit()) - reduction;
		
		System.out.println("Vous avez acheter " + nomObjet + " en " + nombreObjet +
				" pour un montant de " + prixPayee + "€ avec une réduction de " + reduction + "€.");
		System.out.println("Votre numéro de commande est : " + recupererNumeroCommande());
		System.out.println("Vous avez passer " + nombreCommandePasse() + " commande parmis nous ! Merci !");
		
		return prixPayee;
		
	}
	
	private float utiliserCodePromo(String code) {
		if(code == this.codePromoDonnee[0]) {
			return 2.0f;
		}
		else if(code == this.codePromoDonnee[1]) {
			return 0.5f;
		}
		else if(code == this.codePromoDonnee[2]) {
			return 3.1f;
		}
		else {
			System.out.println("Code promo incorrect !");
			return 0.0f;
		}
	}
	
	private int recupererNumeroCommande() {
		return commande.getNumeroCommande();
	}
	
	private int nombreCommandePasse() {
		nombreCommande += commande.getNombreObjet();
		return nombreCommande;
	}

}
